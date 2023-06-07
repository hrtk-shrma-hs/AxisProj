package Manippal.test.cases;

import org.Manipal.PageObjects.DemoHome;
import org.Manipal.PageObjects.addToCart;
import org.Manipal.PageObjects.computerMenu;
import org.Manipal.base.BaseConfigDemo;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCasesDemo extends BaseConfigDemo{
	
	
	           public DemoHome demoObj;
	           public computerMenu computerMenuObj;
	           public addToCart addCartObj;
	           WebDriver driver;
	
	           @BeforeClass
	           public void setup() {
	        	   
	        	   driver=getDemoDriver();
	        	   demoObj = new DemoHome(driver);
	        	   computerMenuObj= new computerMenu(driver);
	        	   addCartObj= new addToCart(driver);
	           }
                
	           
	           @Test
	           public void Scenario() {
	        	   demoObj.verifyDisplay();
	        	   computerMenuObj.computerNavigation();
	        	   addCartObj.addCart();
	           }
	

}
