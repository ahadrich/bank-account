package com.bank.app.bank.account.services;

import java.util.ArrayList;
import java.util.List;

import com.bank.app.bank.account.dao.OperationDAO;
import com.bank.app.bank.account.entites.Account;
import com.bank.app.bank.account.entites.Operation;

/**
 * Operation Services
 * @author ahadrich
 *
 */
public interface IOperationService {
 
	/**
	 * Deposite in the given user account
	 * @param account
	 * @param amount
	 * @return Operation
	 * @throws Exception ex
	 */
	public abstract Operation depositeAccount(Account account, double amount) throws Exception;
	
	/**
	 * Withdrawal from the given user account
	 * @param account
	 * @param amount
	 * @return Operation
	 * @throws Exception ex
	 */
	public abstract Operation withdrawalAccount(Account account, double amount) throws Exception;
	
	/**
	 * Operations history for the given account
	 * @param account
	 * @return List of Operations
	 */
	default List<Operation> historyOperation(Account account) {
		// retrieve all operations for the user account param
		OperationDAO opDAO = new OperationDAO();
		String numeroAccount = account.getBalance().getAccountNumber();
		List<Operation> operations = opDAO.findByAccount(numeroAccount);
		return operations;
	}
	
	/**
	 * Operations history for the given account and from the list of operations
	 * @param account
	 * @param operations
	 * @return list of operations
	 */
	default List<Operation> historyOperation(Account account, List<Operation> operations) {
		// retrieve all operations for the user account param from list of operations
		String numeroAccount = account.getBalance().getAccountNumber();
		List<Operation> history = new ArrayList<Operation>();
		for (Operation operation : operations) {
			if(operation.getAccount().getBalance().getAccountNumber().equals(numeroAccount)) {
				history.add(operation);
			}
		}
		return history;
	}
	
	
}
