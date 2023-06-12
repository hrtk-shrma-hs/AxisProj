package Manippal.test.cases;

import java.net.MalformedURLException;

import org.Manipal.PageObjects.DemoHome;
import org.Manipal.PageObjects.addToCart;
import org.Manipal.PageObjects.computerMenu;
import org.Manipal.base.BaseConfigDemo;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Grid.Prac;

public class TestCasesDemo extends Prac{
	
	
	           public DemoHome demoObj;
	           public computerMenu computerMenuObj;
	           public addToCart addCartObj;
	           WebDriver driver;
	           
	           @Parameters({"Port"})	     
	           @BeforeClass
	           public void setup(String Port) throws MalformedURLException {
	        	   
	        	   driver=setUp(Port);
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
