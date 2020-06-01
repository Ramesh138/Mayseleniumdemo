package com.seleniumprograms.testng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	
	
	@Test
	public void test1(){
		System.out.println("Test 1");
		Assert.assertTrue(true);
		WebDriver driver = null;
		
		String actualvalue=driver.findElement(By.xpath("")).getText();
		Assert.assertEquals("Method", actualvalue);
		
	}
}
