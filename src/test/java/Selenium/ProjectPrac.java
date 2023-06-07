package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\sharm\\Documents\\Tesst\\chromedriver.exe");
		        
		        
		    	WebDriver driver =new ChromeDriver();
			   	driver.get(" https://www.saucedemo.com/");
			   	
			   	//Login
			   	driver.findElement(By.id("user-name")).sendKeys("standard_user");
			   	driver.findElement(By.id("password")).sendKeys("secret_sauce");
			   	driver.findElement(By.id("login-button")).click();
			   	
			   	//Add to Cart
			   	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			 	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
			 	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
			 	driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
			 	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
			 	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
			 	
			 	//click on cart
			 	 driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			 	 
			   //remove products
			 	 driver.findElement(By.id("remove-sauce-labs-backpack")).click();
			 	 driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
			 	 driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
			 	 driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
			 	 driver.findElement(By.id("remove-sauce-labs-onesie")).click();
			 	 driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
			   	
			 
			   //GO back
			 	 driver.findElement(By.id("continue-shopping")).click();
			 	 
			   //Add products again
			  	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			 	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
			 	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
			 	driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
			 	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
			 	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
			 	
			  //cart again
			 	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			 	
			 //Checkout
			 	driver.findElement(By.id("checkout")).click();
			 	
			 //Checkout-Details
			 	driver.findElement(By.id("first-name")).sendKeys("Hritik");
		        driver.findElement(By.id("last-name")).sendKeys("Sharma");
		        driver.findElement(By.name("postalCode")).sendKeys("919293");
		        driver.findElement(By.name("continue")).click();
		        
		     //Check-display
		        System.out.println(driver.findElement(By.xpath("//*[text()='Checkout: Overview']")).isDisplayed());		      
		        System.out.println(driver.findElement(By.xpath("//*[text()='Payment Information']")).isDisplayed());		      
		        System.out.println(driver.findElement(By.xpath("//*[text()='Shipping Information']")).isDisplayed());
		        System.out.println(driver.findElement(By.xpath("//*[text()='Price Total']")).isDisplayed());		       
		        System.out.println(driver.findElement(By.xpath("//*[text()='Total: $']")).isDisplayed());
		        
		     //Finish
		        driver.findElement(By.xpath("//button[text()='Finish']")).click();
		        
		     //Check-Display
		        System.out.println(driver.findElement(By.xpath("//*[text()='Thank you for your order!']")).isDisplayed());
		        System.out.println(driver.findElement(By.xpath("//*[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']")).isDisplayed());
		        System.out.println(driver.findElement(By.xpath("//button[text()='Back Home']")).isDisplayed());
		     
		        
		      

			   	
			   	
			   	
			   	
			   	
			   	
			   	
			   	
			   	
			   	
			   	
	}

}
