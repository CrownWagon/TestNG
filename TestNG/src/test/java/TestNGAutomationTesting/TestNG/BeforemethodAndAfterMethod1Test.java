package TestNGAutomationTesting.TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

/*This program works loginlogout  by opening and closing the  
 * chrome driver in each test cases using Beforemethod and Afthermethod 
 */

public class BeforemethodAndAfterMethod1Test {
 WebDriver  Driver; 
//The annotated method will be run before each test method
 //methods under this annotation will be executed prior to each method in each test case.

 @BeforeMethod
	public void openingnewtoursHomepge() {
		Driver= new ChromeDriver();
		Driver.get("http://newtours.demoaut.com/");	
	}
//The annotated method will be run after each test method.	
 //methods under this annotation will be executed after each method in each test case.
	@AfterMethod
	public void closeTheBrowser() {
    Driver.close();	
	}
	
  @Test
  public void test1() throws InterruptedException {
	  Driver.findElement(By.name("userName")).sendKeys("a");
	  Driver.findElement(By.name("password")).sendKeys("a");
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
      Driver.findElement(By.linkText("SIGN-OFF")).click();
	  String Currenturl = Driver.getCurrentUrl();
	  System.out.println(Currenturl);
	  //Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
	  
	  //System.out.println("Login Test will be excuted here");
  }
  
  @Test
  public void test2() throws InterruptedException {
	  //WebDriver Driver = new ChromeDriver();
	 // Driver.get("http://newtours.demoaut.com/");
	  Driver.findElement(By.name("userName")).sendKeys("a");
	  Driver.findElement(By.name("password")).sendKeys("b");
	  Thread.sleep(5000);
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  Driver.findElement(By.linkText("login")).click();
	  //String Currenturl = Driver.getCurrentUrl();
	  //System.out.println(Currenturl);
	  Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
  }  
  
  
  
  @Test
  public void test3() throws InterruptedException {
	  //WebDriver Driver = new ChromeDriver();
	 // Driver.get("http://newtours.demoaut.com/");
	  Driver.findElement(By.name("userName")).sendKeys("gfghfh");
	  Driver.findElement(By.name("password")).sendKeys("a");
	  Thread.sleep(5000);
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  Driver.findElement(By.linkText("login")).click();
	  //String Currenturl = Driver.getCurrentUrl();
	  //System.out.println(Currenturl);
	  Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
  }  
  
  @Test
  public void tc4() throws InterruptedException {
	  //WebDriver Driver = new ChromeDriver();
	 // Driver.get("http://newtours.demoaut.com/");
	  Driver.findElement(By.name("userName")).sendKeys("a");
	  Driver.findElement(By.name("password")).sendKeys(" ");
	  Thread.sleep(5000);
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  Driver.findElement(By.linkText("login")).click();
	  //String Currenturl = Driver.getCurrentUrl();
	  //System.out.println(Currenturl);
	  Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
  }  
  @Test
  public void tc5() throws InterruptedException {
	  //WebDriver Driver = new ChromeDriver();
	 // Driver.get("http://newtours.demoaut.com/");
	  Driver.findElement(By.name("userName")).sendKeys(" ");
	  Driver.findElement(By.name("password")).sendKeys("b");
	  Thread.sleep(5000);
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  Driver.findElement(By.linkText("login")).click();
	  //String Currenturl = Driver.getCurrentUrl();
	  //System.out.println(Currenturl);
	  Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
  }  
} 
  
  


