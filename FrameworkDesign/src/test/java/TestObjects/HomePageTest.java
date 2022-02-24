package TestObjects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import Pageobjects.Homepage;
import resources.base;

public class HomePageTest extends base{
	
	WebDriver driver;
	
	Homepage HP=new Homepage(driver);
	
	@BeforeTest
	
	 public void callWebdriver() throws IOException
	{
		
		 driver =initializedriver();
		 
		 String Website= prop.getProperty("Url");
		 System.out.println("Website add: "+Website);
		 //String Website = prop.getProperty("https://www.makemytrip.com/");
		 driver.get(Website);
		
	}
	
	@Test(priority=1)
	
	
	public void verifyLogodisplay()
	{
		 HP=new Homepage(driver);		
		boolean display =HP.verifylogodisplay().isDisplayed();		
		Assert.assertTrue(display);
		
		
	}


@AfterTest

public void closebrowser()
{
	driver.close();
}
	
	

}
