package com.seleniumprograms.javaprograms;

public class DuplicateString {
	static String duplicate = " ";
	
	static String counter ="";

	public static void main(String[] args) {

		String prgs[] = { "java", "phython", "dotnet", "java", "oracle" };

		duplicate = prgs[0];

		for (int i = 0; i < prgs.length; i++) {

			if (duplicate != prgs[i]) {
				System.out.println(prgs[i]);
				
				counter= counter+prgs[i]+" ";
			}

		}
		
		System.out.println(counter+ " "+ duplicate);

	}

}
