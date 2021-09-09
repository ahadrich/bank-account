package com.bank.app.bank.account.dao;

import com.bank.app.bank.account.entites.Account;

public class AccountDAO extends DAO<Account>{

	@Override
	public Account find(long id) {
		Account account = new Account();
		// TODO : implement the data base access to retrieve Account
		return account;
	}

	@Override
	public Account create(Account obj) {
		// TODO : implement the data base access to create a new Account
		return obj;
	}

	@Override
	public Account update(Account obj) {
		// TODO : implement the data base access to update the given Account
		return obj;
	}

}
