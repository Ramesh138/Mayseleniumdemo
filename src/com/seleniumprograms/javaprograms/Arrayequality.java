package com.seleniumprograms.javaprograms;

public class Arrayequality {
	
	
	public static void main(String[] args) {
		int arr1[] = { 12, 52, 56, 85, 70, 124, 30 };
		
		int arr2[] = { 12, 52, 56, 85, 69, 124, 30 };
		
		boolean equaltornot=true;
		
		
		
		if(arr1.length==arr2.length) {
			
			for (int i = 0; i < arr2.length; i++) {
				
				if (arr1[i]!=arr2[i]) {
					
					System.out.println(arr1[i]);
					
					System.out.println(arr2[i]);
					
					equaltornot=false;
				}
				
			}
			
		}else {
			equaltornot=false;
		}
		
		if(equaltornot) {
			System.out.println("arrays are equal");
		}else {
			System.out.println("arrays are not  equal");
		}
	}
}
