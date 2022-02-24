package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	private WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this );		
	}
	
	@FindBy(xpath="//*[text()=\"Login or Create Account\"]")
	private WebElement Loginbutton;
	
	
	@FindBy(xpath="//*[@class=\"mmtLogo makeFlex\"]//img")
	private WebElement Makmytriplink;
	
	@FindBy(id="fromCity")	
	private WebElement Origin;
	
	@FindBy(xpath="//*[text()=\"Search\"]")
	private WebElement SearchButton;
	
	public Loginpage Clickonlogin()
	{
		 Loginbutton.click();
		 return  new Loginpage(driver);
		
	}
	
	public WebElement Originport()
	{
		//Origin.click();
		return Origin;		
	}
	
	
	public WebElement verifylogodisplay()
	{
		return Makmytriplink;	
	}
	
	
	
	
	
	

}
