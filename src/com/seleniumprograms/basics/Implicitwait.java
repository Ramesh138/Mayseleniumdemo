package com.seleniumprograms.basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {
public static void main(String[] args) {
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",
			".//driver//chromedriver.exe");
	driver = new ChromeDriver(); 
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now));  
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	
	driver.get("http://demo.guru99.com/test/guru99home/" );
	
	driver.manage().window().maximize() ;
	
	aTitle = driver.getTitle();
	
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	
	else {
	System.out.println( "Test Failed" );
	}
	
	System.out.println(dtf.format(now)); 
	try {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("gcgh")).click();
	} catch (Exception e) {
		System.out.println(dtf.format(now)); 
	}
	
	driver.quit();
}
}
