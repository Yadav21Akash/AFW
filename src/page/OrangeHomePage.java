package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class OrangeHomePage
{
//	@FindBy(linkText="Employee List")
//	private WebElement EmployeeList;
	
	public OrangeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	/*below method will verify whether logout link is visible or not
	 * it will return true if Logout link is visible
	 * it will return false if Logout link is not visible
	 * this method will work even if the application is slow
	 */
	public boolean verifyHomePageIsDisplayed(WebDriverWait wait)
	{
		try
		{
			wait.until(ExpectedConditions.urlContains("viewEmployeeList"));
			Reporter.log("HomePage is displayed",true);		
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("HomePage is not displayed",true);
			return false;
		}

	}
}
