package com.bank.app.bank.account.dao;

import java.util.ArrayList;
import java.util.List;

import com.bank.app.bank.account.entites.Operation;


public class OperationDAO extends DAO<Operation>{

	@Override
	public Operation find(long id) {
		Operation op = new Operation();
		// TODO : implement the data base access to retrieve Operations
		return op;
	}
	
	public List<Operation> findByAccount(String account){
		// TODO : implement the data base access to retrieve Operations of the given account
		return new ArrayList<Operation>();
	}

	@Override
	public Operation create(Operation obj) {
		// TODO : implement the data base access to create a new Operation
		return obj;
	}

	@Override
	public Operation update(Operation obj) {
		// TODO : implement the data base access to update the given Operation
		return obj;
	}

}
