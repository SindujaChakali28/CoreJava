package com.javaintroduction;

public class Cookies {

    public static void main(String[] args) {

        
        int chocolatePrice = 15;
        int cookiePrice = 10;

       
        int chocolates = 10;
        int cookies = 5;

        
        int totalMoney = 450;

        
        int chocolateCost = chocolatePrice * chocolates;
        int cookieCost = cookiePrice * cookies;

        int totalCost = chocolateCost + cookieCost;

      
        int remainingMoney = totalMoney - totalCost;

        System.out.println("Chocolate cost = ₹" + chocolateCost);
        System.out.println("Cookie cost = ₹" + cookieCost);
        System.out.println("Total purchase cost = ₹" + totalCost);
        System.out.println("Money remaining = ₹" + remainingMoney);
    }
}

