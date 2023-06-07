package org.Manipal.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class addToCart {
	
	WebDriver driver;
	public addToCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@value='Add to cart']")
	public WebElement addCart;
	
	public void addCart() {
		
		addCart.click();
	}
	
	
	

}
