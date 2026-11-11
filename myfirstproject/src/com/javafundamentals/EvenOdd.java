package com.javafundamentals;
import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any value");
		int n = sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements");
		for(int i =0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				evenCount++;
				
			}else {
				oddCount++;
				System.out.println("Odd numbers are:"+arr[i]);
			}
		}
		System.out.println("Even count: "+evenCount);
		System.out.println("Odd count: "+oddCount);
		
	}

}
