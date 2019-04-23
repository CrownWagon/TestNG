package TestNGAutomationTesting.TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class LoginLogOutTestNG {
	@BeforeClass
	 public void checkConfigurationAndStartServices() {
		System.out.println(">>>>>>>>>code to check the right version is deployed");
		
	}
	@AfterClass
	public void releaseResources() {
		System.out.println("<<<<<<<<<release database release website");
		System.out.println("<<<<<<<<<<<<open newtours website");
	}
	
	@BeforeMethod
	  public void startSelenium() {
		System.out.println("........open newtours website");
	  
	}
	

	  @AfterMethod
	  public void closeDriverAndClean() {
		 System.out.println("********Close the driver, email to test lead");
	  }
  @Test
  public void LoginLogoutTestWithCorrectCredencials() {
  System.out.println("open newtours website");
  System.out.println("type correct user name and password");
  System.out.println("click submit button");
  System.out.println("assert login is sucessful or not");
  //Assert.assertEquals("solomon", "eshete");
 // Assert.assertTrue();
  }
  @Test
  public void testRegistrationPage() {
	  System.out.println("open newtours home page");
	  System.out.println("click registration page");
	  System.out.println("fill the rigstartion page");
	  System.out.println("click button");
	  System.out.println("assert registration page");
      Assert.assertEquals(1, 1);
  }
  
  

}
