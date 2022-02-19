package sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass11 {
	
	private WebDriver driver;
	
	
	@FindBy(xpath="//input[contains(@class,'input_error form_input')][1]")
	private WebElement nameUser;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement wordPass;
	
	@FindBy(xpath="(//body//div//input)[3]")
	private WebElement inLog;
	
	
	//add to cart
	
	public LoginPageClass11(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void userName()
	{
        nameUser.sendKeys("standard_user");
	}
	
	public void passWord()
	{
        wordPass.sendKeys("secret_sauce");
	}
	
	public void clickLoginButton()
	{
		inLog.click();
	}
	

	}


