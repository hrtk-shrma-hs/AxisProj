package Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	@Test
	public void testcase(){
		System.out.println("TESt");
		;
	}
	
	@BeforeMethod
	public void testcase2() {
		System.out.println("Test before method");
	}
	
	@AfterMethod
	public void testcase3() {
		System.out.println("Test3");
	}
	
	@BeforeClass
	public void testcase4() {
		System.out.println("Test before class");
	}
	
	@AfterClass
	public void testcase5() {
		System.out.println("test5");
	}

}
