package com.javafundamentals;

import java.util.Scanner;


public class Switchcase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int price=0;
		
		String item=" ";
		
		System.out.println("FOOD MENU");
        System.out.println("1. Pizza   - Rs.200");
        System.out.println("2. Burger  - Rs.120");
        System.out.println("3. Biryani - Rs.180");
        System.out.println("4. Noodles - Rs.100");

      System.out.println("Select your item (1-4): ");
     
      int choice = sc.nextInt();
      System.out.println("Enter quantity: ");
      int quantity = sc.nextInt();

      
      switch(choice) {
      
      case 1:
    	  item="Pizza";
    	  price=200;

    	  break;
    	  
      case 2:
    	  item="Burger";
    	  price=120;
    	  break;
    	  
      case 3:
    	  item="Biryani";
    	  price=180;
    	  break;
    	  
      case 4:
    	  item="Noodles";
    	  price=100;
    	  break;
    	  
      default:
        System.out.println("Invalid Choice!");
        sc.close();
        return;

    	  
      }
      
          
    int total = price * quantity;


    System.out.println("Selected Item: " + item);
    System.out.println("Item Price: Rs." + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Total Bill: Rs." + total);
    
    sc.close();
    	  
		
		
		

	}

}


