package com.bank.app.bank.account.services;

import java.util.ArrayList;
import java.util.List;

import com.bank.app.bank.account.dao.OperationDAO;
import com.bank.app.bank.account.entites.Account;
import com.bank.app.bank.account.entites.Operation;

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
	
	
}
