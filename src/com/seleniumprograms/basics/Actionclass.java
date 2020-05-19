package com.seleniumprograms.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		WebElement link = driver.findElement(By.id("sub-menu"));
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		
		Action mouseOverHome = builder.moveToElement(link).build();
		mouseOverHome.perform();
		
		Thread.sleep(2000);
		driver.findElement(By.id("link1")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
