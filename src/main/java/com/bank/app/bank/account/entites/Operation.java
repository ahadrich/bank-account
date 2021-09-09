package com.bank.app.bank.account.entites;

import java.util.Date;

/**
 * the operation related to an account
 * @author ahadrich
 *
 */
public class Operation {
	/**
	 * the operation type 
	 */
	private OperationType operationType;
	
	/**
	 * the User account
	 */
	private Account account;
	
	/**
	 * the date of the operation
	 */
	private Date date;
	
	/**
	 * The amount of the operation
	 */
	private Double amount;
	
	/**
	 * Constructor
	 */
	public Operation() {
				
	}
	
	/**
	 * Constructor
	 * @param type operation type
	 * @param account the user account
	 * @param amount the amount of the operation
	 */
	public Operation(OperationType type, Account account, Double amount) {
		this.operationType = type;
		this.account = account;
		this.amount = amount;
		
	}

	/**
	 * @return the operationType
	 */
	public OperationType getOperationType() {
		return operationType;
	}

	/**
	 * @param operationType the operationType to set
	 */
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	

}
