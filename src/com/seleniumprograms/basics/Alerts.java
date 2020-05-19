package com.seleniumprograms.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("alert")).click();
		
		Alert ale = driver.switchTo().alert();
		
		System.out.println(ale.getText());
		Thread.sleep(2000);
		
		ale.accept();
		
		
		
	
		driver.quit();
		
	}

}
