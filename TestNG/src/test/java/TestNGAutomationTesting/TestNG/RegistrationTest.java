package TestNGAutomationTesting.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class RegistrationTest {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("/////////This suite code from registartion");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("/////////This suite code from registration");
	}
  @BeforeGroups 
  public void beforegroup() {
	  System.out.println("runs before groups starts");
  }
  
  @AfterGroups 
  public void aftergroup() {
	  System.out.println("runs before groups starts");
  }
  
  @Test(priority = 5,groups = {"email", "both"}) 
  public void emailTest1() {
	  System.out.println("<<<<<<<<<<<test with emai5457896@gmail.co and phone ");
  }
  @Test(priority = 3,groups = {"email", "both"})
  public void emailTest2() {
	  System.out.println("<<<<<<<<<<<test with emailbbbbbbb@gmail.com and phone");
  }
  @Test(priority = 1,groups = {"email"})
  public void emailTest3() {
	  System.out.println("<<<<<<<<<<<test with emailcccccccc@gmail.com");
  }
  @Test(priority = 0,groups = {"email"})
  public void emailTest4() {
	  System.out.println("<<<<<<<<<<<test with emailkkkkkkkgmail.com");
  }
  
  /*Since this method is depends on test2 it will only run if test2 is passed/true 
   * otherwise it will be skipped during running.This way we can give dependencies to all the methods*/
  @Test(dependsOnMethods= {"phoneTest2"},priority = 2,groups = {"phone", "both"})
  public void phoneTest1() {
	  System.out.println(">>>>>>>>>>>test phone and email with 54578963589");
  }
  @Test(priority = 4,groups = {"phone"})
  public void phoneTest2() {
	  System.out.println(">>>>>>>>>>>test phone with         ");
	  //This is an example on how to use assertions and dependency together 
	  // To check dependency method we will fail this method or test2  
	  Assert.assertEquals("Java", "Python");
  }
  @Test(priority = 6,groups = {"phone", "both"})
  public void phoneTest3() {
	  System.out.println(">>>>>>>>>>>test phone and email with ghjkliuyt");
  }
  @Test(priority = 5,groups = {"phone", "both"})
  public void phoneTest4() {
	  System.out.println(">>>>>>>>>>>test phone and email with jkkmnnbccd");
  }
}
