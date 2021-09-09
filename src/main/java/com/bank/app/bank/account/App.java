package com.bank.app.bank.account;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bank.app.bank.account.entites.Account;
import com.bank.app.bank.account.entites.Balance;
import com.bank.app.bank.account.entites.Operation;
import com.bank.app.bank.account.services.impl.OperationServiceImpl;

/**
 * Main Application
 * @author ahadrich
 *
 */
public class App {
	
	private static OperationServiceImpl opService = new OperationServiceImpl();
	
	private static List<Operation> historyOperations = new ArrayList<Operation>();
	
    public static void main( String[] args )
    {
        System.out.println( "Welcome To Bank Account Application ! \n" );
        // create Account 1 : 
        String numAccount1 = "FR123456";
        double amountAccount1 = 0.0;
        Balance balanceAccount1 = new Balance(numAccount1,0.0,0.0);
        Account account1 = new Account(balanceAccount1,amountAccount1);
        
        try {
        	Operation operation = opService.depositeAccount(account1, 100.0);
			historyOperations.add(operation);
			operation = opService.withdrawalAccount(account1, 50.0);
			historyOperations.add(operation);
			
			List<Operation> operations = opService.historyOperation(account1,historyOperations);
			System.out.println("Account detail :");
			System.out.println(" Number : " + numAccount1);
			System.out.println(" Amount : " + account1.getAmount());
			System.out.println(" total debits : " + account1.getBalance().getTotalDebits());
			System.out.println(" total credits : " + account1.getBalance().getTotalCredits());

			System.out.println("Operation details :");
			for (Operation op : operations) {
			    
				System.out.println(" Date : " + formatDate(op.getDate()) + " | Type : " + op.getOperationType()
						+ " | Operation Amount : " + op.getAmount());
				
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    /**
     * Format date to dd-MM-yyyy HH:mm:SS format
     * @param date
     * @return formated date
     */
    private static String formatDate(Date date) {
    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:SS");
        return dateFormat.format(date);
    }
}
