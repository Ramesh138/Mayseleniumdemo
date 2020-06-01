package com.seleniumprograms.javaprograms;

public class Reverse {
	
	
	public static void main(String[] args) {
		
		String name="Sowbhagya";
		
		String name1="i am automation tester";
		
		String[] arr=name1.split(" ");
		
		
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(" "+arr[i]);
		}
		
		StringBuffer str= new StringBuffer(name);
		
		System.out.println(str.reverse());
		
		
		String reverse="";
		for (int i = name.length()-1; i >=0 ; i--) {
			
			reverse=reverse+name.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
