package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class FirstJavaScript {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\sharm\\Documents\\Edge_driver\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
	   	driver.get("https://www.calculator.net/calorie-calculator.html%22");
		//driver.findElement(By.id("pass")).sendKeys("hello");
		driver.findElement(By.linkText("BMI")).click();
		driver.findElement(By.partialLinkText("Conception")).click();
		
		

	}

}
