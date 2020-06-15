package com.seleniumprograms.javaprograms;

public class minmax {

	public static void main(String[] args) {

		int arr2[] = { 12, 52, 56, 85, 69, 124, 30 };

		int minvalue = arr2[0];

		int maxvalue = arr2[0];

		for (int i = 1; i < arr2.length; i++) {

			if (arr2[i] > maxvalue) {
				maxvalue = arr2[i];
			}
		}

		for (int i = 1; i < arr2.length; i++) {

			if (arr2[i] < minvalue) {
				minvalue = arr2[i];
			}

		}
		
		System.out.println("min valve  ="+minvalue);
		
		System.out.println(" max value ="+maxvalue);

	}

}
