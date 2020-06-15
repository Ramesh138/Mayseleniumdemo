package com.seleniumprograms.javaprograms;

public class pairsum {
	
	public static void main(String[] args) {
		
		
		int arr[]=  { 2, 4, 6 , 8 , 9, 3 ,10,1,11};
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]+arr[j]==12) {
					System.out.println( arr[i] +" "+arr[j]  + " : "+(arr[i] +arr[j]));
				}
				
			}
			
		}
		
		
	}

}
