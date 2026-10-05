
package com.javaintroduction;

public class FiveMethods {

    // Static Method 1
    static void method1() {
        System.out.println("Static method1 called");
    }

    // Static Method 2
    static void method2() {
        System.out.println("Static method2 called");
    }

    // Static Method 3
    static void method3() {
        System.out.println("Static method3 called");
    }

    // Instance Method 1
    void method4() {
        System.out.println("Instance method4 called");
    }

    // Instance Method 2
    void method5() {
        System.out.println("Instance method5 called");
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

       
        method1();
        method2();
        method3();

        
        FiveMethods obj = new FiveMethods();

       
        obj.method4();
        obj.method5();

        System.out.println("Main method ended");
    }
}

