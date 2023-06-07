package org.Manipal.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage {
	
	WebDriver driver;
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	
	
	
	@FindBy(id="nav-link-accountList")
	public WebElement signInButton;
	
	public void verifyHomeLaunchSuccess() {
		signInButton.isDisplayed();
		Assert.assertTrue(signInButton.isDisplayed(),"sign in button is not displayed");
	}

}
