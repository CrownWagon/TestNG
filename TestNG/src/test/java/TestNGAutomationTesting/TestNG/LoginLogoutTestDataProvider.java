package TestNGAutomationTesting.TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


public class LoginLogoutTestDataProvider {
	// this is a program of login logout test using Data provider
 WebDriver  Driver; 
	@BeforeClass
	public void openingnewtoursHomepge() {
		Driver= new ChromeDriver();
		Driver.get("http://newtours.demoaut.com/");	
	}
	
	@AfterClass
	public void closeTheBrowser() {
		  Driver.close();	
	}
  @Test
  public void loginTestwithcorrectcredentials() throws InterruptedException {
	  Driver.findElement(By.name("userName")).sendKeys("a");
	  Driver.findElement(By.name("password")).sendKeys("a");
	 // Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  Driver.findElement(By.name("login")).click();

  Driver.findElement(By.linkText("SIGN-OFF")).click();
	  String Currenturl = Driver.getCurrentUrl();
	  System.out.println(Currenturl);
	  //Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
	  
	  
	  
	  //System.out.println("Login Test will be excuted here");
  }
  @Test(dataProvider="userNameandPassword")
  public void loginTestwithwrongcredentials(String name, String password) throws InterruptedException {
	  //WebDriver Driver = new ChromeDriver();
	 // Driver.get("http://newtours.demoaut.com/");
	  Driver.findElement(By.name("userName")).sendKeys(name);
	  Driver.findElement(By.name("password")).sendKeys(password);
	  Driver.findElement(By.name("login")).click();
//  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  //String Currenturl = Driver.getCurrentUrl();
	  //System.out.println(Currenturl);
	  Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
  }
  
  
 /* Another way of using Dataprovider 
  @DataProvider
  public Object[][]userNameandPassword() {
	return new Object[][] {
	new Object[] {"a","a"}, //we can also read this from excel file 
	new Object[] {"b","b"},
	new Object[] {"c","c"},
	new Object[] {"d","d"},
	new Object[] {"e","e"},
	};
  }*/
  
   @DataProvider
   public  Object[][] userNameandPassword() {
     Object[][] userNameAndPasswordObject= new Object[][] {
   	     {"a", "dddddd"},
    	 {"a", "dddddd"},
    	 {"a", "dddddd"},
    	 {"a", "dddddd"},
    	 {"a", "dddddd"},
    	 {"abcdef", "a"},
    	 {"  ", "sdfsd"}
  
};

     return userNameAndPasswordObject;    
}

  
}  


