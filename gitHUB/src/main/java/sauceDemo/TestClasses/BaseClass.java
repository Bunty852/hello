package sauceDemo.TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import sauceDemo.POMClasses.HomePageClass11;
import sauceDemo.POMClasses.LoginPageClass11;

public class BaseClass
{
	
	WebDriver driver;
	LoginPageClass11 inLog1;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setupMethod(String browserName)
	{
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedrivernew.exe");
	     driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	else if(browserName.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	}
	else
	{
//		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
//	    driver = new FirefoxDriver();
//	    driver.manage().window().maximize();
	}
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	
	    

	    inLog1 = new LoginPageClass11(driver);
	    
	    inLog1.userName();
	    inLog1.passWord();
	    inLog1.clickLoginButton();
	} 

	@AfterMethod
	public void tearDown()
	{
		    driver.quit();
	

}
}