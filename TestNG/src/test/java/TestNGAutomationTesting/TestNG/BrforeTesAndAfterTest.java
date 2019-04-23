package TestNGAutomationTesting.TestNG;

import org.testng.annotations.Test;


	import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;
	public class BrforeTesAndAfterTest {
	   
		public String baseUrl = "http://newtours.demoaut.com";
	  
	    public WebDriver driver ; 
	   /*The annotated method will be run before any test method belonging to 
	    * the classes inside the tag is run.  
	    * Methods under this annotation will be executed prior to the first test 
	    * case in the TestNG file.
	    */
	     @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	     
	          driver = new ChromeDriver();
	          driver.get(baseUrl);
	      }
	      @Test//Marks a class or a method as part of the test.
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      /*The annotated method will be run after all the test methods belonging to the
	       *  classes inside the <test> tag have run.
	       *  Methods under this annotation will be executed after all test cases in the 
	       *  TestNG file are executed.
	       */
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
  }
}
