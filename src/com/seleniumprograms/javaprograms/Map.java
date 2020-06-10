package com.seleniumprograms.javaprograms;

import java.util.HashMap;

public class Map {
	
	public static void main(String[] args) {
		
		
		HashMap<String , Integer>  hmap=  new HashMap<String, Integer>();
		
		hmap.put("Ramesh", 1);
		
		hmap.put("Suresh", 2);
		
		hmap.put("mahesh", 3);
		
		System.out.println(hmap);
		
		System.out.println(hmap.get("Suresh"));
		
		System.out.println(hmap.keySet());
		
		
		System.out.println(hmap.values());
	}

}
