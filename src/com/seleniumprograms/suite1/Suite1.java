package com.seleniumprograms.suite1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suite1 {
WebDriver driver;
	@BeforeSuite
	public void m8() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("prompt")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		//Wait for the alert to be displayed and store it in a variable
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		//Type your message
		alert.sendKeys("Selenium");

		//Press the OK button
		alert.accept();
		
		Thread.sleep(2000);
		
		
		
		
		
	
		driver.quit();
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

	@Test(priority = 1)
	public void t1() {
		System.out.println(" I am second Test 1");
		
	}

	@Test(priority = 2)
	public void t2() {
		System.out.println(" I am second Test 11");
	}
	
	@Test(priority = 3 )
	public void t3() {
		System.out.println(" I am second Test 12");
	}
	
	@Test(priority = 4)
	public void t4() {
		System.out.println(" I am second Test 13 ");
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
