package TestNGAutomationTesting.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("/////////This suite code runs only time at starting point");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("/////////This suite code runs only one time after your suite");
	}
	@BeforeTest 
	
	public void beforetest() {
		System.out.println("--------This part will run before test is runing");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("--------this part will run after test complete");
	}
		@BeforeClass
		public void beforeclass() {
			
		System.out.println("++++++++++code will run before class begins");
	}
		
		@AfterClass
		public void afterclass() {
			
		System.out.println("+++++++++code will run after class begins");
		}
	 @BeforeMethod
	  public void openNewToursPage() {
	  
		 System.out.println(",,,,,,,open firefox");
		  System.out.println(",,,,,,,open newtours website");
	  }

 @AfterMethod
 
	public void closeNewtoursPage () {
	 System.out.println(",,,,,,,,,close browser");
	}
  
	  @Test 
	  public void LoginLogoutTestWithCorrectCredencials() {
	
	  
	  System.out.println(".........type correct user name and password");
	  System.out.println(".........click submit button");
	  System.out.println(".........assert login is sucessful or not");
	  
  }
	  
	  @Test 
	  public void LoginLogoutTestWithWrongCredencials() {
	  
	  System.out.println(">>>>>>>type incorect user name and password");
	  System.out.println(">>>>>>>click submit button");
	  System.out.println(">>>>>>>>assert login is sucessful or not");
	
}
}
