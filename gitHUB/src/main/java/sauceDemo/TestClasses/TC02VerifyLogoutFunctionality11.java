package sauceDemo.TestClasses;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import sauceDemo.POMClasses.HomePageClass11;


public class TC02VerifyLogoutFunctionality11 extends BaseClass
{
	HomePageClass11 home11;
	@Test
     	public void logOutMethod()
		{
		  home11 = new HomePageClass11(driver);
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		    home11.clickSettingButton();
		    home11.clickLogoutButton();
	    
	   System.out.println("Logout Functionality is Verified");
	    
	}   
		
	}





