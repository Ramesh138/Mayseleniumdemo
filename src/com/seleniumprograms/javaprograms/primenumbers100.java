package com.seleniumprograms.javaprograms;

import java.util.Scanner;

public class primenumbers100 {

	
	
public static void method(int number) {
	
	
	int temp=0;
	
	for (int i = 2; i < number-1; i++) {
		
		if (number%i==0) {
			temp= temp+1;
			
			
		}
	}
	
	if (temp==0) {
		System.out.println(" No is prime ");
	}
	else {
		System.out.println("No is not prime");
	}
}
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" enter the number");
		
		int number=sc.nextInt();
		
		int temp=0;
		
		for (int i = 2; i < number-1; i++) {
			
			if (number%i==0) {
				temp= temp+1;
			}
		}
		
		if (temp==0) {
			System.out.println(" No is prime ");
		}
		else {
			System.out.println("No is not prime");
		}
	}

}


