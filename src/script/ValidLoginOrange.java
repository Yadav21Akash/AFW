package script;

import org.testng.Assert;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Utility;
import page.LoginPageOrange;
import page.OrangeHomePage;

public class ValidLoginOrange extends BaseTest
	{
			@Test(priority = 1)
			public void testValidLoginOrange() throws Exception
			{
				String un = Utility.getXLData(testDataPath,"ValidLogin",2,0);
				String pwd = Utility.getXLData(testDataPath,"ValidLogin",2,1);
				
//		        1. Enter valid user name
				LoginPageOrange loginPageOrange = new LoginPageOrange(driver);
				loginPageOrange.setUserName(un);
				
//				2. Enter valid password
				loginPageOrange.setPassword(pwd);
				
//				3. Click on login button
				loginPageOrange.clickLoginButton();
				
//				4. Verify that home page is displayed
				OrangeHomePage homePage = new OrangeHomePage(driver);
				boolean res = homePage.verifyHomePageIsDisplayed(wait);
				
				//true->PASS     false->FAIL
				Assert.assertEquals(res,true);
			}
	}


