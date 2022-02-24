package TestObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.Homepage;
import Pageobjects.Loginpage;
import resources.base;

public class LoginpageTest extends base{
	WebDriver driver;
	
	
	
	
	@BeforeTest
	public void callWebdriver() throws IOException
	{
		
		 driver =initializedriver();
		 
		 String Website= prop.getProperty("Url");
		 System.out.println("Website add: "+Website);
		 //String Website = prop.getProperty("https://www.makemytrip.com/");
		 driver.get(Website);
		
	}
	
	@Test
	public void EnterMobileNumber() throws InterruptedException
	{
		
		Homepage HP=new Homepage(driver);
		 Loginpage LP=HP.Clickonlogin();
		 
		driver.navigate().refresh();
		 
		Thread.sleep(2000);
		LP.EnterMobileNumber("9932457634");
		//LP.EnterMobileNumber("9976453214");
		//Assert.assertTrue(LP.PersonelAccount().isDisplayed());
		
	}
	
	@AfterTest
	
	public void closebrowser()
	{
		driver.close();
	}
	

	


}
