package org.Manipal.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class computerMenu {
	
	WebDriver driver;
	Actions act;
	
	
    public computerMenu(WebDriver driver) {
          		
	                	this.driver=driver;
	                	this.act=new Actions(driver);
		             PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@href='/computers'])[1]")
	public WebElement computerOpt;
	
	@FindBy(xpath="(//*[@href='/desktops'])[1]")
	public WebElement desktopOpt;
	
	public void computerNavigation() {
		
	  	
		act.moveToElement(computerOpt).build().perform();
		desktopOpt.click();
		
	 	
	   
	}

}
