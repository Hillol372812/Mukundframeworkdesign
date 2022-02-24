package resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public static WebDriver driver;
	public static Properties prop;
		
	public static WebDriver initializedriver() throws IOException
	{
		
		FileInputStream fis	=new FileInputStream("E:\\Desktop\\Selenium WorkSpace\\FrameworkDesign\\src\\main\\java\\TestData.properties");
		 prop =new Properties();
		prop.load(fis);
		
		
		String Browsername = prop.getProperty("Browser");
		System.out.println(Browsername);
		if(Browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		
		}
		else if(Browsername.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		
		return driver;
	}

}
