package com.bank.app.bank.account.entites;

/**
 * The balance of the user account
 * @author ahadrich
 *
 */
public class Balance {
	
	/**
	 * Account Number
	 */
	private String accountNumber;
	
	/**
	 * The total of debits of the account
	 */
	private double totalDebits;
	
	/**
	 * The total of credit of the account
	 */
	private double totalCredits;
	
	/**
	 * Constructor
	 */
	public Balance() {
		
	}
	
	/**
	 * Constructor
	 * @param account
	 * @param totalDebits
	 * @param totalCredits
	 */
    public Balance(String account, double totalDebits, double totalCredits) {
    	this.accountNumber = account;
    	this.totalDebits = totalDebits;
    	this.totalCredits = totalCredits;		
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the totalDebits
	 */
	public double getTotalDebits() {
		return totalDebits;
	}

	/**
	 * @param totalDebits the totalDebits to set
	 */
	public void setTotalDebits(double totalDebits) {
		this.totalDebits = totalDebits;
	}

	/**
	 * @return the totalCredits
	 */
	public double getTotalCredits() {
		return totalCredits;
	}

	/**
	 * @param totalCredits the totalCredits to set
	 */
	public void setTotalCredits(double totalCredits) {
		this.totalCredits = totalCredits;
	}
	


}
