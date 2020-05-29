package com.seleniumprograms.testng;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(RealTimeReport.class)
public class Testcase1  {   
	    
	
	
	
	/*
	 * @BeforeTest public void launchurl() throws InterruptedException, IOException
	 * {
	 * 
	 * 
	 * System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	 * driver = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(30,
	 * TimeUnit.SECONDS); Thread.sleep(2000);
	 * System.out.println("Starting the suite");
	 * driver.get(Propertyfile.prop("url")); driver.manage().window().maximize();
	 * driver.manage().deleteAllCookies(); Thread.sleep(2000);
	 * System.out.println("Launching the URL"); }
	 */
	
	/*
	 * @Test public void tc1() throws IOException { Flow_login fl= new
	 * Flow_login(driver);
	 * 
	 * // fl.login(Propertyfile.prop("username"), Propertyfile.prop("password"));
	 * 
	 * fl.login(getdata("TC1", 0),getdata("TC1", 1)); }
	 */
	@Test
	public void m3() {
		System.out.println("m2");
	}
	
	@Test
	public void m1() {
		throw new  Error();
	}
	
	@Test(enabled = false)
	public void m2() {
		System.out.println(" SOmething ");
	}
	
	
	
	
	/*
	 * @AfterTest public void closethebrowser() { driver.quit(); }
	 */
	
	

}
