package com.seleniumprograms.javaprograms;

public class AlphaNumericspecialSeparation {
	
	public static void separate(String string) {
        StringBuilder alphabetsBuilder = new StringBuilder();
        StringBuilder numbersBuilder = new StringBuilder();
        StringBuilder symbolsBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isAlphabetic(ch)) {
                alphabetsBuilder.append(ch);
            } else if (Character.isDigit(ch)) {
                numbersBuilder.append(ch);
            } else {
                symbolsBuilder.append(ch);
            }
        }
        System.out.println("Alphabets in string: " + alphabetsBuilder.toString());
        System.out.println("Numbers in String: " + numbersBuilder.toString());
        System.out.println("Sysmbols in String: " + symbolsBuilder.toString()); 
    }
	
	public static void Separate(String str) 
	{
	    String number = "";
	    String letter = "";
	    String symbol = "";

	    for (int i = 0; i < str.length(); i++) 
	    {
	        char a = str.charAt(i);
	        if (Character.isDigit(a)) 
	        {
	            number = number + a;
	            continue;
	        } 
	        if(Character.isLetter(a))
	        {
	            letter = letter + a;
	        }
	        else
	        {
	            symbol = symbol + a;
	        }
	    }
	    System.out.println("Alphabets in string:"+letter);
	    System.out.println("Numbers in String:"+number);  
	    System.out.println("Numbers in String:"+symbol);  
	}

	
	public static void main(String[] args) {
		Separate("Ramesh@1990Ra");
	}
}
