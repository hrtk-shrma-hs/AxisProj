package org.Manipal.base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseConfigurations {
	
	
	@Test
	public WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sharm\\Documents\\Tesst\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   	driver.get("https://www.amazon.in/");
	   	driver.manage().window().maximize();
	   	return driver;
		 
	}

}
