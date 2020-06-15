package com.seleniumprograms.javaprograms;

public class zerosprogram2 {
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,8,7,0,0,50,06,90,8,0};
		
		String nonzero="";
		
		String  zeros="";
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if(arr[i]>0) {
								
				nonzero=nonzero+arr[i]+" ";
			}else {
				zeros=zeros+arr[i]+" ";
			}
		}
		
		System.out.println(zeros +" "+nonzero);
	}

}
