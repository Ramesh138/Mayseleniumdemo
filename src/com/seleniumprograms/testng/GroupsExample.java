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

public class GroupsExample {

	
	@BeforeSuite
	public void m8() {
		System.out.println(" i am before suite");
	}

	@BeforeTest
	public void m1() {

		System.out.println(" i am before test");
	}

	@BeforeClass
	public void m6() {
		System.out.println(" i am before class");
	}

	@BeforeMethod
	public void m4() {
		System.out.println(" I am Before method");
	}

	@Test(groups = {"Smoketest"})
	public void t1() {
		System.out.println(" I am Test 1");
	}

	@Test(groups = {"Smoketest","Functional"})
	public void t2() {
		System.out.println(" I am Test 11");
	}
	
	@Test(groups = {"Smoketest"})
	public void t3() {
		System.out.println(" I am Test 12");
	}
	
	@Test(groups = {"Regression"})
	public void t4() {
		System.out.println(" I am Test 13 ");
	}
	
	@Test(groups = {"Functional"})
	public void t5() {
		System.out.println(" I am Test 12");
	}
	
	@Test(groups = {"Regression"})
	public void t6() {
		System.out.println(" I am Test 13 ");
	}
	
	@AfterMethod
	public void m5() {
		System.out.println(" I am After Method");
	}

	@AfterClass
	public void m7() {
		System.out.println(" i am after class");
	}

	@AfterTest
	public void m3() {
		System.out.println(" i am after test ");

	}

	@AfterSuite

	public void m9() {
		System.out.println(" i am After suite");
	}
}
