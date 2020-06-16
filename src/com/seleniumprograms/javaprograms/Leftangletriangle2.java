package com.seleniumprograms.javaprograms;

public class Leftangletriangle2 {
	static int n = 6;

	public static void main(String[] args) {

		for (int i = 0; i < n; i++) {
			
			for (int j = n - i; j > 1; j--)
			
			{
				System.out.print(" "); 
			}

			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*"); 
			}

			
			System.out.println();
		}

	}
}
