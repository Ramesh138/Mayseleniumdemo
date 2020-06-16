package com.seleniumprograms.starprograms;

public class Leftangletriangle2 {
	static int n = 6;

	public static void main(String[] args) {

		for (int i = 0; i < n; i++) {

			for (int j = n - i; j > 1; j--)
			// inner loop for spaces
			{
				System.out.print(" "); // print space
			}

			for (int j = 0; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("*"); // print star
			}

			System.out.println();
		}

	}
}
