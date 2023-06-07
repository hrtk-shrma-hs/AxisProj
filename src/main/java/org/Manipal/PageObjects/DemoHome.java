package org.Manipal.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DemoHome {
	
	WebDriver driver;
	public DemoHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@alt='Tricentis Demo Web Shop']")
	WebElement demoLogo;
	
	@FindBy(linkText="Register")
	WebElement register;
	
	@FindBy(linkText="Log in")
	WebElement login;
	
	@FindBy(xpath="(//*[text()='Shopping cart'])[1]")
	WebElement shoppingCart;

	@FindBy(xpath="(//*[text()='Wishlist'])[1]")
	WebElement wishlist;
	
	public void verifyDisplay() {
		
		demoLogo.isDisplayed();
		Assert.assertTrue(demoLogo.isDisplayed());
		
		register.isDisplayed();
		Assert.assertTrue(register.isDisplayed());
		
		login.isDisplayed();
		Assert.assertTrue(login.isDisplayed());
		
		shoppingCart.isDisplayed();
		Assert.assertTrue(shoppingCart.isDisplayed());
		
		wishlist.isDisplayed();
		Assert.assertTrue(wishlist.isDisplayed());
		
		
		
		
	}
	

}
