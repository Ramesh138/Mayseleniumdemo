package com.seleniumprograms.javaprograms;

import java.util.Arrays;

public class zerosprogram {
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,8,7,0,0,50,06,90,8,0};
		
		
		int counter=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if(arr[i]!=0) {
				
				arr[counter]=arr[i];
				
				counter++;
						
			}
		}
		
		while (counter<arr.length) {
			
		arr[counter]=0;
		counter++;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
