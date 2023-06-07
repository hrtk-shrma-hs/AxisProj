package Manippal.test.cases;

import org.Manipal.PageObjects.Hamburger;
import org.Manipal.PageObjects.Homepage;
import org.Manipal.PageObjects.MobilePage;
import org.Manipal.base.BaseConfigurations;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases1  extends BaseConfigurations {

	
	//1. Declare page objects
	//2. We will initialize the page object
	//3. Implement inheritence concept
	//4. create test case
	// create web driver refernece
	

	//Homepage homeObj = new HomePage();
//	Hamburger hamObj = new Hamburger();
//	MobilePage mobileObj = new MobilePage();
	
	// Declaration of page objects
	
	public Homepage homeObj;
	public Hamburger hamObj;
	public MobilePage mobileObj;
	WebDriver driver;
	
	@BeforeMethod
	public void initialiSetup() {
		driver = getDriver();
		homeObj = new Homepage(driver);
		hamObj =new Hamburger(driver);
		mobileObj = new MobilePage(driver);
		
	}
	
	@Test
	public void scenario1() {
		
		homeObj.verifyHomeLaunchSuccess();
		hamObj.menuNavigation();
		mobileObj.verifyLabel();
		
	}
	
	
	
	
	
	
	
	
	
}
