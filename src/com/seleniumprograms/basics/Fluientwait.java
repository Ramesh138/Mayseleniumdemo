package com.seleniumprograms.basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluientwait {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();

		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		driver = new ChromeDriver();
		// launch Chrome and redirect it to the Base URL
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		driver.get("http://demo.guru99.com/v1/");
	
		driver.manage().window().maximize();
		System.out.println(dtf.format(now));
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(10, TimeUnit.SECONDS)
		.pollingEvery(5, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				System.out.println(dtf.format(now));
				System.out.println(" i am in");
				return driver.findElement(By.xpath(".//input[@name='uid']"));
			}
		});
		// click on the selenium link
		clickseleniumlink.sendKeys("Rames");
		// close~ browser
		driver.quit();
	}
}
