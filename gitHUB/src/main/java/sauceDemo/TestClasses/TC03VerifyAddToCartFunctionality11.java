package sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sauceDemo.POMClasses.HomePageClass11;
import sauceDemo.POMClasses.LoginPageClass11;

public class TC03VerifyAddToCartFunctionality11 extends BaseClass {
	HomePageClass11 home11;
	@Test
	public void verifyAddToCart()
	{
	    home11 = new HomePageClass11(driver);
	    home11.ClickAddToCart();
	    System.out.println("Products are added to the cart");
	    
	}

}



