package com.seleniumprograms.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ParallelExcution {
WebDriver driver;
	@Test
	public void ex1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("alert")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		//Wait for the alert to be displayed and store it in a variable
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//Type your message
	

		//Press the OK button
		alert.accept();
		
		Thread.sleep(2000);
		
		
		
		
		
	
		driver.quit();
		System.out.println(" i am before suite");
	}

	@Test
	public void ex2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("alert")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		//Wait for the alert to be displayed and store it in a variable
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//Type your message
	

		//Press the OK button
		alert.accept();
		
		Thread.sleep(2000);
		
		
		
		
		
	
		driver.quit();
		System.out.println(" i am before suite");
	}

	@Test
	public void ex3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("alert")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		//Wait for the alert to be displayed and store it in a variable
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//Type your message
	

		//Press the OK button
		alert.accept();
		
		Thread.sleep(2000);
		
		
		
		
		
	
		driver.quit();
		System.out.println(" i am before suite");
	}

	@Test
	public void ex4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("alert")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		//Wait for the alert to be displayed and store it in a variable
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//Type your message
	

		//Press the OK button
		alert.accept();
		
		Thread.sleep(2000);
		
		
		
		
		
	
		driver.quit();
		System.out.println(" i am before suite");
	}
}
