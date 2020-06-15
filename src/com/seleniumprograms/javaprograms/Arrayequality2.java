package com.seleniumprograms.javaprograms;

import java.util.Arrays;

public class Arrayequality2 {
	
	
	public static void main(String[] args) {
		int arr1[] = { 12, 52, 56, 85, 70, 124, 30 };
		
		int arr2[] = { 12, 52, 56, 85, 69, 124, 30 };
		
		boolean equaltornot=Arrays.equals(arr1, arr2);
		
		
		if(equaltornot) {
			System.out.println("arrays are equal");
		}else {
			System.out.println("arrays are not  equal");
		}
		
		
		
		
	}
}
