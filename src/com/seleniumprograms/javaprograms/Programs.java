package com.seleniumprograms.javaprograms;

import java.util.Arrays;

public class Programs {

	public static void total_count_of_charaacters() {
		String string = "The best of both worlds";
		int count = 0;

		// Counts each character except space
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}

		// Displays the total number of characters present in the given string
		System.out.println("Total number of characters in a string: " + count);
	}

	public static void vowels_And_Constants() {

		int vcount = 0;
		int Ccount = 0;

		String str = "This is a really simple sentence";

		String strvalue = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			if (strvalue.charAt(i) == 'a' || strvalue.charAt(i) == 'e' || strvalue.charAt(i) == 'i'
					|| strvalue.charAt(i) == 'o' || strvalue.charAt(i) == 'u') {
				vcount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				Ccount++;
			}
		}
		System.out.println(vcount);
		System.out.println(Ccount);
	}

	public static void check_Anagram() {

		String str1 = "Brag";
		String str2 = "Grab";

		String strvalue1 = str1.toLowerCase();
		String strvalue2 = str2.toLowerCase();

		if (strvalue1.length() != strvalue2.length()) {
			System.out.println("String was not anagram");
		} else {
			char[] ch1 = strvalue1.toCharArray();
			char[] ch2 = strvalue2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2) == true) {
				System.out.println("String was anagram");
			} else {
				System.out.println(" String was not anagram");
			}
		}

	}

	public static void allSubset() {

		String str = "FUN";
		int len = str.length();
		int temp = 0;
		// Total possible subsets for string of size n is n*(n+1)/2
		String arr[] = new String[len * (len + 1) / 2];

		// This loop maintains the starting character
		for (int i = 0; i < len; i++) {
			// This loop adds the next character every iteration for the subset to form and
			// add it to the array
			for (int j = i; j < len; j++) {
				arr[temp] = str.substring(i, j + 1);
				temp++;
			}
		}

		// This loop prints all the subsets formed from the string.
		System.out.println("All subsets for given string are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void uppertoLower_lowertoLower() {

		String str = "Great Power";

		StringBuffer newstr = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLowerCase(str.charAt(i))) {

				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str.charAt(i))) {
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}

		System.out.println(newstr);
	}

	public static void frequancy_of_charcters() {
		String str = "grass is greener on the other side";
		int[] freq = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int i, j, min, max;

		// Converts given string into character array
		char string[] = str.toCharArray();

		// Count each word in given string and store in array freq
		for (i = 0; i < string.length; i++) {
			freq[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i]++;
					// System.out.println(freq[i]);
					// Set string[j] to 0 to avoid printing visited character
					// string[j] = '0';
				}
			}
		}

		// Determine minimum and maximum occurring characters
		min = max = freq[0];

		System.out.println(freq.length);
		for (i = 0; i < freq.length; i++) {

			// If min is greater than frequency of a character
			// then, store frequency in min and corresponding character in minChar
			if (min > freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = string[i];
			}
			// If max is less than frequency of a character
			// then, store frequency in max and corresponding character in maxChar
			if (max < freq[i]) {
				max = freq[i];
				maxChar = string[i];
			}
		}

		System.out.println("Minimum occurring character: " + minChar);
		System.out.println("Maximum occurring character: " + maxChar);
	}

	public static void duplicate_Character() {

		String string1 = "Great responsibility";

		int count;

		char[] str2 = string1.toCharArray();

		for (int i = 0; i < str2.length; i++) {
			count = 1;

			for (int j = i + 1; j < str2.length; j++) {

				if (((str2[i] == str2[j]) && (str2[i] != ' '))) {
					count++;
					str2[j] = '0';
				}
			}
			if (count > 1 && str2[i] != '0') {
				System.out.println(str2[i]);
			}
		}

	}

	public static void count_Of_Occurance() {

		String string1 = "Great responsibility";

		int count;

		int freq[] = new int[string1.length()];

		char[] str2 = string1.toCharArray();

		for (int i = 0; i < str2.length; i++) {

			freq[i] = 1;

			for (int j = i + 1; j < str2.length; j++) {

				if (str2[i] == str2[j] && str2[i] != ' ') {
					freq[i]++;

					str2[j] = '0';
				}
			}

		}
		for (int i = 0; i < freq.length; i++) {

			if (str2[i] != ' ' && str2[i] != '0')
				
				System.out.println(str2[i] + "-" + freq[i]);
		}
	}
	
	public static void swapWords() {
		  String str1 = "Good ", str2 = "morning ";    
	         System.out.println("Strings before swapping: " + str1 + " " + str2);    
	        
	        //Concatenate both the string str1 and str2 and store it in str1    
	        str1 = str1 + str2;    
	        //Extract str2 from updated str1    
	        str2 = str1.substring(0, (str1.length() - str2.length()));    
	        //Extract str1 from updated str1    
	        str1 = str1.substring(str2.length());    
	            
	        System.out.println("Strings after swapping: " + str1 + " " + str2);   
	}
}