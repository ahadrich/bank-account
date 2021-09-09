package com.bank.app.bank.account.dao;

/**
 * DAO class : define CRUD operations
 * @author ahadrich
 *
 * @param <T>
 */
public abstract class DAO<T> {
	
	/**
     * Find Object by ID
     * @param id
     * @return Object 
     */
    public abstract T find(long id);
    
    /**
     * Create an entry in the data base usind the param object
     * @param obj
     */
    public abstract T create(T obj);
    
    /**
     * Upadte the data of the entry in the data base
     * @param obj
     */
    public abstract T update(T obj);
    

}
