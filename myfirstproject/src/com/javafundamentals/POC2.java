
package com.javafundamentals;

import java.util.Scanner;

public class POC2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String category;
        String item;
        String moreFood = "no";
        String moreCategory = "no";

        int totalBill = 0;

        do {
            System.out.println("\n===== WELCOME TO RESTAURANT =====");
            System.out.println("Breakfast");
            System.out.println("Lunch");
            System.out.println("FastFood");
            System.out.println("Desserts");
            System.out.println("Beverages");
            System.out.println("Exit");

            System.out.print("Select category: ");
            category = sc.nextLine().trim();

            if (category.equalsIgnoreCase("Exit")) {
                break;
            }

            if (!(category.equalsIgnoreCase("Breakfast")
                    || category.equalsIgnoreCase("Lunch")
                    || category.equalsIgnoreCase("FastFood")
                    || category.equalsIgnoreCase("Fast Food")
                    || category.equalsIgnoreCase("Desserts")
                    || category.equalsIgnoreCase("Beverages"))) {

                System.out.println("Invalid category choice!");
                continue;
            }

            do {
                switch (category.toLowerCase()) {

                    case "breakfast":
                        System.out.println("\n--- BREAKFAST ---");
                        System.out.println("Idly - Rs.30");
                        System.out.println("Dosa - Rs.50");
                        System.out.println("Vada - Rs.25");
                        break;

                    case "lunch":
                        System.out.println("\n--- LUNCH ---");
                        System.out.println("Veg Meals - Rs.120");
                        System.out.println("Chicken Biryani - Rs.180");
                        System.out.println("Fried Rice - Rs.100");
                        break;

                    case "fastfood":
                    case "fast food":
                        System.out.println("\n--- FAST FOOD ---");
                        System.out.println("Pizza - Rs.200");
                        System.out.println("Burger - Rs.100");
                        System.out.println("Sandwich - Rs.80");
                        break;

                    case "desserts":
                        System.out.println("\n--- DESSERTS ---");
                        System.out.println("Ice Cream - Rs.60");
                        System.out.println("Cake - Rs.80");
                        System.out.println("Gulab Jamun - Rs.40");
                        break;

                    case "beverages":
                        System.out.println("\n--- BEVERAGES ---");
                        System.out.println("Tea - Rs.15");
                        System.out.println("Coffee - Rs.25");
                        System.out.println("Juice - Rs.50");
                        break;
                }

                System.out.print("Enter food name: ");
                item = sc.nextLine().trim();

                int price = 0;
                boolean validFood = false;

                switch (category.toLowerCase()) {

                    case "breakfast":
                        if (item.equalsIgnoreCase("Idly")) {
                            price = 30;
                            validFood = true;
                        } else if (item.equalsIgnoreCase("Dosa")) {
                            price = 50;
                            validFood = true;
                        } else if (item.equalsIgnoreCase("Vada")) {
                            price = 25;
                            validFood = true;
                        }
                        break;

                    case "lunch":
                        if (item.equalsIgnoreCase("Veg Meals")) {
                            price = 120;
                            validFood = true;
                        } else if (item.equalsIgnoreCase("Chicken Biryani")) {
                            price = 180;
                            validFood = true;
                        } else if (item.equalsIgnoreCase("Fried Rice")) {
                            price = 100;
                            validFood = true;
                        }
                        break;

                    case "fastfood":
                    case "fast food":
                        if (item.equalsIgnoreCase("Pizza")) {
                            price = 200;
                            validFood = true;
                        } else if (item.equalsIgnoreCase("Burger")) {
                            price = 100;
                            validFood = true;
                        } else if (item.equalsIgnoreCase("Sandwich")) {
                            price = 80;
                            validFood = true;
                        }
                        break;

                    case "desserts":
                        if (item.equalsIgnoreCase("Ice Cream")) {
                            price = 60;
                            validFood = true;
                        } else if (item.equalsIgnoreCase("Cake")) {
                            price = 80;
                            validFood = true;
                        } else if (item.equalsIgnoreCase("Gulab Jamun")) {
                            price = 40;
                            validFood = true;
                        }
                        break;

                    case "beverages":
                        if (item.equalsIgnoreCase("Tea")) {
                            price = 15;
                            validFood = true;
                        } else if (item.equalsIgnoreCase("Coffee")) {
                            price = 25;
                            validFood = true;
                        } else if (item.equalsIgnoreCase("Juice")) {
                            price = 50;
                            validFood = true;
                        }
                        break;
                }

                if (!validFood) {
                    System.out.println("Invalid food choice!");
                    continue;
                }

                totalBill = totalBill + price;

                System.out.println(item + " selected - Rs." + price);
                System.out.println("Current Bill: Rs." + totalBill);

                System.out.print(
                    "Do you want more food in this category? (yes/no): ");
                moreFood = sc.nextLine().trim();

            } while (moreFood.equalsIgnoreCase("yes")
                    || moreFood.equalsIgnoreCase("y"));

            System.out.print(
                "Do you want to select another category? (yes/no): ");
            moreCategory = sc.nextLine().trim();

        } while (moreCategory.equalsIgnoreCase("yes")
                || moreCategory.equalsIgnoreCase("y"));

        System.out.println("\n===== FINAL BILL =====");
        System.out.println("Total Bill: Rs." + totalBill);
        System.out.println("Thank you for visiting our restaurant!");

        sc.close();
    }
}


//import java.util.Scanner;

//public class PositiveNegative {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//
//        String result = (num >= 0) ? "Positive Number" : "Negative Number";
//
//        System.out.println(result);
//
//        sc.close();
//    }
//}




