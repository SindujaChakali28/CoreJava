package com.javaintroduction;

public class DemoMethod {
	
	static void method1() {
		System.out.println("method1 called");
		
	}
	
	void method2() {
		System.out.println("method2 called");
		
	}
	
	void method3() {
		System.out.println("method3 called");
		method2();
		method1();
	}
	
	void method4() {
		method1();
		method3();
		
		System.out.println("method4 called");
		method2();
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		DemoMethod d=new DemoMethod();
		d.method4();
		System.out.println("Main method ended");
		
		
		
	}

}
