package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class YourStore extends BasePage {
	public YourStore(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[@class = 'dropdown-toggle']")
	public WebElement drp_accnt;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	public WebElement click_login;
	
	
	public void ClickonMyaccount(){
		drp_accnt.click();
	}
	public void ClickonLogin(){
		click_login.click();
	}
}
