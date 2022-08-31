package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPageOrange 
{
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(name="password")
	private WebElement pwTB;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//p[text()='Invalid credentials']")
	private WebElement errMsg;
	
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
	
	public boolean verifyErrMsgDisplayed(WebDriverWait wait)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			Reporter.log("Err Msg is Displayed",true);
			
			return true;//pass
		}
		catch (Exception e) 
		{
			Reporter.log("Err Msg is Not Displayed",true);
			return false;//fail
		}
	}
}
