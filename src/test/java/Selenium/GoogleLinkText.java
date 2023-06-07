package Selenium;
//import java.util.Iterator;
import java.util.Set;
// import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class GoogleLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sharm\\Documents\\Tesst\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
			   	driver.get("https://www.amazon.in/");
			   	driver.manage().window().maximize();
			   	
			   	
			   	Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
				driver.findElement(By.xpath("(//*[text()='Sign in'])[1]")).isDisplayed();
				driver.findElement(By.xpath("//*[@aria-label='Open Menu']")).click();
				driver.findElement(By.xpath("(//*[@data-menu-id= '8'])[1]")).click();
				driver.findElement(By.linkText("All Mobile Phones")).click();
				driver.findElement(By.xpath("(//*[text()='Mobiles & Accessories'])[3]")).isDisplayed();
				
			}
			   	
			   	
			   	
			   	
             
			   	
	}

			   	
			   	
//	String parent =driver.getWindowHandle();
//	System.out.println(parent);
//	
//	Set<String> windowsID = driver.getWindowHandles();
//	
//	Iterator<String> it = windowsID.iterator();
//	
//	while (it.hasNext()) {
//		String child =it.next();
//		if (parent.equals(child))
//		{
//			driver.switchTo().window(child);
//		}
//	}
//	driver.findElement(By.xpath("//*[@data-action='sign-in']"));
//	
//	driver.switchTo().window(parent);
			   	
			   	
			   	
			   	
			   	
			   	
			   	// MOUSE HOVER CONTEXT CLICk
			   	
//			   	Actions act= new Actions(driver);
//      	   	act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
//			
//			act.contextClick(driver.findElement(By.xpath("(//*[text()='Your Account'])[2]"))).build().perform();
//			   	
//		   	WebElement accountSignIn=driver.findElement(By.xpath("//*[text()='Account & Lists']"));
//		   	WebElement yourAccountLabel=driver.findElement(By.xpath("//*[text()='Your Account'])[2]"));			   	
//	     	act.moveToElement(accountSignIn).contextClick(yourAccountLabel).build().perform();			   	
//	  
//			   	
			   	
			   	
			   	
			   	
			   	// ACtions class helps u to mimic hovering,double click,drag drop
//			   	
//			   	Actions act = new Actions(driver);
//			   	
//			   	act.dragAndDrop(driver.findElement(By.xpath("//*[text()=' 5000']")), driver.findElement(By.xpath("amt8"))).build().perform();
			   	
			   	
				//driver.findElement(By.id("pass")).sendKeys("hello");
				//driver.findElement(By.linkText("Images")).click();
				//driver.findElement(By.partialLinkText("Conception")).click();
			   	//driver.findElement(By.linkText("Gmail")).click();
//			   	driver.findElement(By.id("cage")).clear();
//			   	driver.findElement(By.id("cage")).sendKeys("22");
//			  	driver.findElement(By.id("cheightmeter")).clear();
//			   	driver.findElement(By.id("cheightmeter")).sendKeys("180");
//			   	driver.findElement(By.id("ckg")).clear();
//			   	driver.findElement(By.id("ckg")).sendKeys("60");
	//		   	driver.findElement(By.id("vfb-7-1")).click();
			   	
			   	
			   	// select dropdowns
//			   	Select sel=new Select(driver.findElement(By.name("country")));
//			   	
//			   	sel.selectByValue("ANGOLA");
			  // 	sel.selectByVisibleText("Antartica");
			  // 	sel.selectByIndex(5);
			   	
			   	/// ALERT BOX
//			   	
//			   	driver.findElement(By.name("submit")).click();
//			   	
//			   	Alert obj=driver.switchTo().alert();
//			   	obj.accept();
//			   	System.out.println(obj.getText());
//			   	obj.dismiss();
//			   			
//			   	
			   	
			   	
			   	
				



//*[@data-nav-role='signin']
//*[@aria-label='Open menu']


//*[forgot password()]
//(//*[contains(@id,'link-accountList')])[1]
//(//*[text()='Your Account'])[2]
//*[contains(text(),' male')]