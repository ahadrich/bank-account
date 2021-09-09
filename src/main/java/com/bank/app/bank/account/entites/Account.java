package com.bank.app.bank.account.entites;

import java.util.Date;

/**
 * the User account
 * @author ahadrich
 *
 */
public class Account {
	
	/**
	 * Date of last update 
	 */
	private Date date;
	
	/**
	 * Amount of Account
	 */
	private Double amount;
	
	/**
	 * Balance of Account
	 */
	private Balance balance;
	
	/**
	 * Constructor
	 */
	public Account() {
		
	}

	/**
	 * Constructor
	 * @param balance
	 * @param amount
	 */
	public Account(Balance balance, Double amount) {
		this.balance = balance;
		this.amount = amount;		
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

	/**
	 * @return the balance
	 */
	public Balance getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Balance balance) {
		this.balance = balance;
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

}
