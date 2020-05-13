package com.seleniumprograms.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		String url = "http://newtours.demoaut.com/";

		// driver.get(url);

		driver.navigate().to(url);

		String tittle = driver.getTitle();

		System.out.println(tittle);

		String current = driver.getCurrentUrl();

		System.out.println(current);

		String pagesource = driver.getPageSource();

		System.out.println(pagesource);

		driver.findElement(By.name("userName")).sendKeys("Pradeephnk@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("Hansika2010");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("login")).click();
		
		WebElement depfrom = driver.findElement(By.name("fromPort"));
		
		Select depdropdown = new Select(depfrom);

		depdropdown.selectByVisibleText("London");
		
		Thread.sleep(1000);

		depdropdown.selectByIndex(6);
		
		Thread.sleep(1000);
		
		depdropdown.selectByValue("Paris");
		
		Thread.sleep(1000);

		/* closing the browser */

		driver.close();// close will close the browser

		/* quit the browser */

		driver.quit(); // Quit wil the session and instance of the driver
	}

}
