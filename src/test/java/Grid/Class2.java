package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Class2 {
	@Test
public void scenario1() throws MalformedURLException {
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.3:4444"),dc);
		driver.get("https://www.amazon.in/");
		
	}


}
