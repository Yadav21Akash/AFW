package script;

import org.testng.Assert;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Utility;
import page.LoginPageOrange;

public class InvalidLoginOrange extends BaseTest
{
	@Test(priority = 2)
	public void testInvalidLogin() throws Exception
	{
//		get data from excel file
		String un = Utility.getXLData(testDataPath,"InvalidLogin",2,0);
		String pwd = Utility.getXLData(testDataPath,"InvalidLogin",2,1);
		
//        1. Enter valid user name
		LoginPageOrange loginPageOrange = new LoginPageOrange(driver);
		loginPageOrange.setUserName(un);
		
//		2. Enter valid password
		loginPageOrange.setPassword(pwd);
		
//		3. Click on login button
		loginPageOrange.clickLoginButton();
		
//		4. Verify that home page is displayed
		boolean res = loginPageOrange.verifyErrMsgDisplayed(wait);
		
//		Assert.assertEquals(res, true);
		Assert.assertTrue(res);
	}
}
