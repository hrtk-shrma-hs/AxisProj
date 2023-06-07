package org.Manipal.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hamburger {
	
	
	WebDriver driver;
	
	public Hamburger(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this); ///initialize the elements
	}
	
	@FindBy(id="nav-hamburger-menu")
	public WebElement hamburgerButton;
	
	@FindBy(xpath = "//*[text()='Mobiles, Computers']")
	public WebElement MobileComputerMenLb1;
	
	
	@FindBy(xpath ="//*[text()='All Mobile Phones']")
	public WebElement allMobileLbl;
	
	
	
	
	public void menuNavigation()
	{
		 hamburgerButton.click();
		 MobileComputerMenLb1.click();
		 allMobileLbl.click();
		
	}

}
