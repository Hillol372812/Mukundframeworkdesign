package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
private WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this );		
	}
	
	@FindBy(xpath="//*[text()=\"Personal Account\"]")
	private WebElement PersonnelAccount;

	public WebElement PersonelAccount()
	{
		return PersonnelAccount;
	}
	
	
	@FindBy(id="username")
	private WebElement MobileNumber;
	
	public void EnterMobileNumber(String MobNum)
	{
		MobileNumber.sendKeys(MobNum);
	}
	
	
	
}
