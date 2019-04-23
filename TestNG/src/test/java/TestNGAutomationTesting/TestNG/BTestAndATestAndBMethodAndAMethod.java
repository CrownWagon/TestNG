package TestNGAutomationTesting.TestNG;

import org.testng.annotations.Test;


	
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;

	public class BTestAndATestAndBMethodAndAMethod {
		
		//In Mercury Tours, suppose we like to verify the titles of the target pages of the two links below.
		
		/*Go to the homepage and verify its title.
		  Click REGISTER and verify the title of its target page.
		  Go back to the homepage and verify if it still has the correct title.
		  Click SUPPORT and verify the title of its target page.
		  Go back to the homepage and verify if it still has the correct title*/
	    
		/*The code below illustrates how @BeforeMethod and @AfterMethod 
		 * are used to efficiently execute the scenario mentioned above.
		 */
		
		public String baseUrl = "http://newtours.demoaut.com";
	    
		
	    
		public WebDriver driver; 
	    public String expected = null;
	    public String actual = null;
	       
	    @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	         
	          driver= new FirefoxDriver();
	          driver.get(baseUrl);
	      }
	      
	      @BeforeMethod
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	      }
	          @Test(priority = 0)
	      public void register(){
	          driver.findElement(By.linkText("REGISTER")).click() ;
	          expected = "Register: Mercury Tours";
	          actual = driver.getTitle();
	          Assert.assertEquals(actual, expected);
	      }
	          @Test(priority = 1)
	      public void support() {
	            driver.findElement(By.linkText("SUPPORT")).click() ;
	            expected = "Under Construction: Mercury Tours";
	            actual = driver.getTitle();
	            Assert.assertEquals(actual, expected);
	      }
	      @AfterMethod
	      public void goBackToHomepage ( ) {
	            driver.findElement(By.linkText("Home")).click() ;
	      }
	       
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
  }
}
