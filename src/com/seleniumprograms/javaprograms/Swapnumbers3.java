package com.seleniumprograms.javaprograms;

public class Swapnumbers3 {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		
		/*
		 * int arr[]= {a,b};
		 * 
		 * a=arr[1];
		 * 
		 * b=arr[0];
		 */
		
	
		  a = a + b; 
		  b = a - b; 
		  a = a - b;
		 
		
		System.out.println(a);
		
		System.out.println(b);
		
		
	}

}
