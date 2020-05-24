package com.seleniumprograms.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Getdataexamplewithclass {
	
	@Test(dataProvider="TC1" , dataProviderClass = GetData.class)
	public void tc1(String name,String lastname,String firstname,String emailId) {
		
		
		System.out.println("my lastname  :"+lastname);
		
		System.out.println("my lastname  :"+firstname);
		
		System.out.println("my lastname  :"+name);
		
		System.out.println("my lastname  :"+emailId);
	}
	
	@Test(dataProvider="TC2" ,dataProviderClass = GetData.class)
	public void tc2(String name,String lastname,String firstname,String emailId) {
		
		
		System.out.println("my lastname  :"+lastname);
		
		System.out.println("my lastname  :"+firstname);
		
		System.out.println("my lastname  :"+name);
		
		System.out.println("my lastname  :"+emailId);
	}
	
	@Test(dataProvider="TC3",dataProviderClass = GetData.class)
	public void tc3(String name,String lastname,String firstname,String emailId) {
		
		
		System.out.println("my lastname  :"+lastname);
		
		System.out.println("my lastname  :"+firstname);
		
		System.out.println("my lastname  :"+name);
		
		System.out.println("my lastname  :"+emailId);
	}
	
	
	
	


}
