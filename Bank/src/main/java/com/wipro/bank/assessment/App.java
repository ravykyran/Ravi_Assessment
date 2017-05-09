package com.wipro.bank.assessment;

import java.util.ArrayList;
import java.util.List;

import com.wipro.bank.entity.Account;

/**
 * Hello world!
 *
 */
public class App 
{
	static final List<Account> accounts = new ArrayList<Account>();
	
	App(){
		
	}
	
//	public App (List<Account> accounts){
//		this.accounts = accounts;
//	}
		
	public Account getAccountDetailsByID(int id){
		
		Account account = null;
		
		if(id>0){
			for(Account a:accounts){
				if(id==a.getAccountID()){
					account=a;
				}
			}
		}
		return account;
	}

	
	
	public List<Account> getAccountDetailsByBalance(double amount){
		List<Account> foundAccount = new ArrayList<Account>();
		

			for(Account acc: accounts){
				if(acc!=null){
					if(acc.getBalance()>amount){
						System.out.println(amount+">=" +acc.getBalance());
						foundAccount.add(acc);
						
					}
				}
			}
			
			System.out.println(foundAccount.size()+" ****");
			if(foundAccount.size()==0){
				foundAccount=null;
			}
			
			
		
		
		
		return foundAccount;


	}
}


