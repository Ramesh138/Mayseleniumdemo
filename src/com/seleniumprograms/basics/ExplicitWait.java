package com.seleniumprograms.basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		
		driver.get("http://demo.guru99.com/v1/" );
		
		driver.manage().window().maximize() ;
		
		//WebElement ele= driver.findElement(By.xpath(".//*[@type='sumit']"));
		
		System.out.println(dtf.format(now));
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@type='submit']"))));
		
		System.out.println(dtf.format(now));
		
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		
		driver.quit();
	}

}
