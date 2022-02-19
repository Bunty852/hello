package sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01VerifyLoginFunctionality11  extends BaseClass
{
	@Test
	public void verifyLogin()
	{
	    String actualTitle = "Swag Labs";
	    String expectedTitle = "Swag Labs";
	    Assert.assertEquals(actualTitle, expectedTitle);
	    System.out.println("Login Functionality is Verified");
	}
} 
	
	



