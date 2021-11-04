package com.dinh2008110105.baitaptuan5.account;

public class Account {
    int account_number;
	int account_balance;


	Account(int a, int b){
		account_number = a;
		account_balance = b;
	}
	
	void show(){
		System.out.println("Account Number = " + account_number);
		System.out.println("Account Balance = " + account_balance);
	}

	void deposit(){
		account_balance += 100;
		System.out.println("Account Balance = " + account_balance);
	}

	void withdraw(){
		account_balance -= 50;
		System.out.println("Account Balance = " + account_balance);
	}	
}
