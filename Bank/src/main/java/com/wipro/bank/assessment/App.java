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
		if (amount == 0)
		{
			for(Account a: accounts){
				if(a!=null){
					if(a.getBalance()==0){
						foundAccount.add(a);
					}
				}
			}
			
		}else if (amount>0){
			for (Account a: accounts){
				if(a.getBalance()!=0){
					if(amount==a.getBalance()){
						foundAccount.add(a);
					}
				}
			}
		}
		return foundAccount;
	} 
	
}
