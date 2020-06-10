package com.seleniumprograms.javaprograms;

public class Reverseanumber {
	
	public static void main(String[] args) {
		
		
		int num =743322;
		
		int rev=0;
		
		while (num!=0) {
			
		
			rev=rev*10 +  num%10;
			
			num= num/10;
			
			//0+4  rev == 4
			
			//40+2===42
			
			//420+  1 ==421
		}
		
		System.out.println(rev);
	}

}
