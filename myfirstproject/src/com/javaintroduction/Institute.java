package com.javaintroduction;

public class Institute {
	
	static String TrainerName1="xyz";
	static String TrainerName2="abc";
	String EmployeeName;
	int EmployeeId;
	String EmployeeDesignation;

	public static void main(String[] args) {
		Institute i1=new Institute();
		Institute i2=new Institute();
		i1.EmployeeName="apple";
		i1.EmployeeId=11;
		i1.EmployeeDesignation="JFS";
		i2.EmployeeName="Banana";
		i2.EmployeeId=22;
		i2.EmployeeDesignation="PFS";
		System.out.println("TrainerName1:" + TrainerName1 );
		System.out.println("TrainerName2:"+ TrainerName2);
		System.out.println("EmployeeName:"+ i1.EmployeeName);
		System.out.println("EmployeeId:"+ i1.EmployeeId);
		System.out.println("EmployeeDesignation:"+ i1.EmployeeDesignation );
		System.out.println("EmployeeName:" + i2.EmployeeName);
		System.out.println("EmployeeId:" + i2.EmployeeId);
		System.out.println("EmployeeDesignation:" + i2.EmployeeDesignation);
		
		

	}

}
