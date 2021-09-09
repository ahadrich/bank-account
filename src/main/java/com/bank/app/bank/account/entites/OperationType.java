package com.bank.app.bank.account.entites;

/**
 * The account operation type
 * @author ahadrich
 *
 */
public enum OperationType {
	
	DEPOSITE, 
	
	WITHDRAWAL;
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}	

}
