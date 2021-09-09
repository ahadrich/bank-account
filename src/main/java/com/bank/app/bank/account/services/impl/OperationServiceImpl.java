package com.bank.app.bank.account.services.impl;

import com.bank.app.bank.account.dao.AccountDAO;
import com.bank.app.bank.account.dao.OperationDAO;
import com.bank.app.bank.account.entites.Account;
import com.bank.app.bank.account.entites.Balance;
import com.bank.app.bank.account.entites.Operation;
import com.bank.app.bank.account.entites.OperationType;
import com.bank.app.bank.account.services.IOperationService;

public class OperationServiceImpl implements IOperationService{

	@Override
	public Operation depositeAccount(Account account, double amount) throws Exception {
		try {
			return updateAmount(account, OperationType.DEPOSITE, amount);
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public Operation withdrawalAccount(Account account, double amount) throws Exception {
		try {
			return updateAmount(account, OperationType.WITHDRAWAL, amount);
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	private Operation updateAmount(Account account, OperationType type, double amount) throws Exception {
		
		double newAmount = account.getAmount();
		Balance balance = account.getBalance();
		if(OperationType.DEPOSITE.equals(type)) {
			 newAmount = account.getAmount() + amount;
			 double totalDebit = balance.getTotalDebits() + amount;
			 balance.setTotalDebits(totalDebit);
			 
		} else if(OperationType.WITHDRAWAL.equals(type)) {			
			 newAmount = account.getAmount() - amount;
			 double totalCredit = balance.getTotalCredits() + amount;
			 balance.setTotalCredits(totalCredit);
			 
		} else {
			throw new Exception("Error : The Operation " + type.getName() +" is not supported");
		}
		account.setAmount(newAmount);
		account.setBalance(balance);
		// update the account in the data base
		AccountDAO accDao = new AccountDAO();
		accDao.update(account);
		// create new operation for the account
		OperationDAO opDao = new OperationDAO();
		Operation op = opDao.create(new Operation(type, account, amount));
		return op;
		
	}

}
