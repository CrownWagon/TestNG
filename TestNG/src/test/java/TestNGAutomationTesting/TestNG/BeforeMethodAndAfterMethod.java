package TestNGAutomationTesting.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class BeforeMethodAndAfterMethod {
	 WebDriver driver;
	 
	
	
  @BeforeMethod
	  public void openNewToursPage() {
	  //Lunch browser and open the url
	     driver = new ChromeDriver();
		 driver.get("http://www.newtours.demoaut.com");
	  }
 
  @AfterMethod
  //terminateBrowser
	public void closeNewtoursPage () {
		driver.close();
	}
	
  @Test
  public void LoginLogOutTest1() {
	  //find the element and send Username and password 
	  //driver = new ChromeDriver();
	 // driver.get("http://www.newtours.demoaut.com");
	  driver.findElement(By.name("userName")).sendKeys("a");
	  driver.findElement(By.name("password")).sendKeys("a");
	  driver.findElement(By.name("login")).click();
	  Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
	  //driver.close();
  }
  
  @Test
  public void LoginLogOutTest2() {
	  //driver = new ChromeDriver();
	  //driver.get("http://www.newtours.demoaut.com");
	  driver.findElement(By.name("userName")).sendKeys("a");
	  driver.findElement(By.name("password")).sendKeys("ahnnkll");
	  driver.findElement(By.name("login")).click();
	  Assert.assertFalse(driver.getTitle().contains("Find a Flight"));
	  //driver.close();
  }
  @Test
  public void LoginLogOutTest3() {
	  //driver = new ChromeDriver();
	  //driver.get("http://www.newtours.demoaut.com");
	  driver.findElement(By.name("userName")).sendKeys("asdbmn");
	  driver.findElement(By.name("password")).sendKeys("a");
	  driver.findElement(By.name("login")).click();
	  Assert.assertFalse(driver.getTitle().contains("Find a Flight"));
	 // driver.close();
  }
  @Test
  public void LoginLogOutTest4() {
	  //driver = new ChromeDriver();
	  //driver.get("http://www.newtours.demoaut.com");
	  driver.findElement(By.name("userName")).sendKeys("ajklo");
	  driver.findElement(By.name("password")).sendKeys("amnbo");
	  driver.findElement(By.name("login")).click();
	  Assert.assertFalse(driver.getTitle().contains("Find a Flight"));
	 // driver.close();
  }

  
  }


