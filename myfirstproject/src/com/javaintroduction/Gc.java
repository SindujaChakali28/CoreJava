package com.javaintroduction;

public class Gc {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("hello");
	
	}
	void hi() {
		System.out.println("hi");
		Gc h1=new Gc();
	}

	public static void main(String[] args) {
		Gc g1 =new Gc();
		Gc g2 =new Gc();
		Gc g3 =new Gc();
		Gc g4 =new Gc();
		
		g1=null;
		
		g2=g1;
		
		new Gc().hi();
		System.gc();
		

	}

}
