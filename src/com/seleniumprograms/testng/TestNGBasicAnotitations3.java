package com.seleniumprograms.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasicAnotitations3 {

	

	@BeforeClass
	public void m6() {
		System.out.println(" i am before class");
	}

	@BeforeMethod
	public void m4() {
		System.out.println(" I am Before method");
	}

	@Test(priority = 7)
	public void t1() {
		System.out.println(" I am Test 3");
	}

	@Test(priority = 8)
	public void t2() {
		System.out.println(" I am Test 31");
	}
	
	@Test(priority = 9)
	public void t3() {
		System.out.println(" I am Test 32");
	}
	
	@Test(priority = 10)
	public void t4() {
		System.out.println(" I am Test 33");
	}
	
	@AfterMethod
	public void m5() {
		System.out.println(" I am After Method");
	}

	@AfterClass
	public void m7() {
		System.out.println(" i am after class");
	}

	
}
