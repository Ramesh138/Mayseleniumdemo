package com.seleniumdemo.javascript;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTablee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Create FF instance
		WebDriver driver = new FirefoxDriver();

		//Implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Maximize the window
		driver.manage().window().maximize();

		//Launch the url
		driver.get("http://erail.in/");
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("mas"+Keys.TAB);
		driver.findElement(By.id("txtStationTo")).sendKeys("ed"+Keys.TAB);

		WebElement tableElement=driver.findElement(By.xpath("//table[@class='DataTable TrainList']"));
		
		//Getting rows
		List<WebElement> rows=tableElement.findElements(By.tagName("tr"));
		
		System.out.println("No of Trains"+rows.size());
		
		for(WebElement r : rows){
			List<WebElement> cells=r.findElements(By.tagName("td"));
			String trNum=cells.get(0).getText();
			if(trNum.equals("18189")){
				System.out.println("the train name is "+cells.get(1).getText());
				break;
			}
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
