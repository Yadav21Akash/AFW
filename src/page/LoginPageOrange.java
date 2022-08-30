package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOrange 
{
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(name="password")
	private WebElement pwTB;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	public LoginPageOrange(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		pwTB.sendKeys(pwd);
	}
	
	public void clickLoginButton()
	{
		loginBtn.click();
	}
}
