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
	private long accountNumber;
	
	/**
	 * The total of debits of the account
	 */
	private Double totalDebits;
	
	/**
	 * The total of credit of the account
	 */
	private Double totalCredits;
	
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
    public Balance(long account, Double totalDebits, Double totalCredits) {
    	this.accountNumber = account;
    	this.totalDebits = totalDebits;
    	this.totalCredits = totalCredits;		
	}

	/**
	 * @return the accountNumber
	 */
	public long getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the totalDebits
	 */
	public Double getTotalDebits() {
		return totalDebits;
	}

	/**
	 * @param totalDebits the totalDebits to set
	 */
	public void setTotalDebits(Double totalDebits) {
		this.totalDebits = totalDebits;
	}

	/**
	 * @return the totalCredits
	 */
	public Double getTotalCredits() {
		return totalCredits;
	}

	/**
	 * @param totalCredits the totalCredits to set
	 */
	public void setTotalCredits(Double totalCredits) {
		this.totalCredits = totalCredits;
	}
	


}
