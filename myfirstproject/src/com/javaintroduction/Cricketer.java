package com.javaintroduction;

public class Cricketer {
	
	static int countryID;
	static String countryName;
	
	int jerseyNumber;
	String crickterName;

	public static void main(String[] args) {
		System.out.println("Welcome to Indian cricket Team");
		
		countryID=91;
		countryName="INDIA";
		
		Cricketer msd= new Cricketer();
		msd.jerseyNumber=7;
		msd.crickterName="dhoni";
		
		System.out.println("Country ID:" + countryID);
		System.out.println("CountryName:"+ countryName);
		
		System.out.println("JerseyNumber:" + msd.jerseyNumber);
		System.out.println("CrickterName:" + msd.crickterName);
		

	}

}
