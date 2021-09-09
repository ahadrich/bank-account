package com.bank.app.bank.account.dao;

import com.bank.app.bank.account.entites.Balance;

public class BalanceDAO extends DAO<Balance> {

	@Override
	public Balance find(long id) {
		Balance balance = new Balance();
		// TODO : implement the data base access to retrieve Account
		return balance;
	}

	@Override
	public Balance create(Balance obj) {
		// TODO : implement the data base access to create a new balance related to existent account
		return obj;
	}

	@Override
	public Balance update(Balance obj) {
		// TODO : implement the data base access to update the given balance
		return obj;
	}

}
