package Practice;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class MercurryTest 
{
	WebDriver driver;
	Properties pro=new Properties();
	static Logger log=Logger.getLogger(MercurryTest.class.getName());
	 @BeforeSuite
	public void beforeSuite() throws IOException 
	  {
		 FileInputStream fim=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Aug_4(use git)\\parameter.properties");
		 pro.load(fim);
		 System.setProperty("webdriver.chrome.driver", "F:\\cjc testing\\chrome exe\\chromedriver_win32\\chromedriver.exe");
			
			 driver=new ChromeDriver();
	  }
	 
	 @BeforeClass
	  public void beforeClass() 
	 {
		 driver.get("http://demo.guru99.com/test/newtours/register.php");
	 }
	 
	 @BeforeTest
	  public void beforeTest() 
	 {
		 driver.manage().window().maximize();	
	 }
	 
	
	  @Test
	  public void f() throws InterruptedException 
	  {
             log.info("start");
             
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(pro.getProperty("nilesh2"));
			
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(pro.getProperty("dhakad2"));
			
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(pro.getProperty("96373765842"));
			
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(pro.getProperty("karvenagar2"));
			
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(pro.getProperty("pune2"));
			
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys(pro.getProperty("maharastra2"));
			
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(pro.getProperty("2520222"));
			
		    WebElement sel=	driver.findElement(By.xpath("//option[@value=\"INDIA\"]/parent :: select"));
		           sel.click();
		   
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys(pro.getProperty("nilesh1"));
		   
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pro.getProperty("nilesh@1232"));
		   
		   driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(pro.getProperty("nilesh@1234"));
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//input[@name='submit']")).click();
		   
		   log.info("finish");
		  
	  }
	  

	  }
  

  

 
  

