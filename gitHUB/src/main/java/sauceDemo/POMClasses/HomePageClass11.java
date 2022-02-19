package sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass11 {
	private WebDriver driver;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement buttonSetting;
	
	@FindBy(xpath="(//body//div//a)[3]")
	private WebElement buttonLogOut;
	
	// add to cart
	@FindBy(xpath="//body//div//button")
	private List <WebElement> addTocart;
	
	public HomePageClass11(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
     }
//	this.driver=driver;
//	PageFactory.initElements(driver,this);
	
	public void clickSettingButton() 
	{
		buttonSetting.click();
	}
	
	public void clickLogoutButton()
	{
		buttonLogOut.click();
	}
	
	public void ClickAddToCart()
	{
		for(int i=2;i<=7;i++)
		{
			addTocart.get(i).click();
		}
	}
}



