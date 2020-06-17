package com.seleniumprograms.starprograms;

public class Rombus {
	static int n = 5;

	public static void main(String[] args) {
		for (int i = 0; i < n; i++) // outer loop for number of rows(n)
		{
			for (int j = n - i; j > 1; j--)
			// inner loop for spaces
			{
				System.out.print(" "); // print space
			}
			for (int j = 0; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("* "); // print star
			}

			System.out.println(); // ending line after each row
		}
		
		 for (int i= 0; i<= n-1 ; i++)
		    {
			 int space =n-2-i;
			 
		        for (int j=0; j<=i; j++)
		        {
		            System.out.print(" ");
		        }
		        for (int k=0; k<=space; k++)
		        {
		            System.out.print("* ");
		        }
		        System.out.println();
		    }

	}

}
