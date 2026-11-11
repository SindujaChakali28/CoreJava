package com.javaintroduction;

public class BankAccount {
	static int balance=1000;
	void deposite() {
		balance=balance+500;
		System.out.println("total balance:"+balance);
	}
	void withdraw() {
		balance=balance-200;
		System.out.println("remainig balance:"+balance);
		
	}
	
	

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.deposite();
		b.withdraw();
		System.out.println("balance:"+b.balance);
		
	}

}
