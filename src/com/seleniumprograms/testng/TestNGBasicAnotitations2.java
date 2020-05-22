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

public class TestNGBasicAnotitations2 {



	@BeforeClass
	public void m6() {
		System.out.println(" i am before class");
	}

	@BeforeMethod
	public void m4() {
		System.out.println(" I am Before method");
	}

	@Test(priority = 3)
	public void t1() {
		System.out.println(" I am Test 2");
	}

	@Test(priority = 4)
	public void t2() {
		System.out.println(" I am Test 21");
	}
	
	@Test(priority = 5)
	public void t3() {
		System.out.println(" I am Test 22");
	}
	
	@Test(priority = 6)
	public void t4() {
		System.out.println(" I am Test 23 ");
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
