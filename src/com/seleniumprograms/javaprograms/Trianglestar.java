package com.seleniumprograms.javaprograms;

public class Trianglestar {
	
	public static void main(String[] args) {
		
		
		int n= 6;
		
		for (int i = 0; i < 6; i++) {   
			
			for (int j = n-i; j >1; j--) {
				
				System.out.print(" ");
			}
			
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		
	}

}
