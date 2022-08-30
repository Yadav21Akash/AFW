package Day31;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
class A
{
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
}

public class Demo1 extends A
{	
	@Test
	public void testA()
	{
		Reporter.log("testA",true);
	}	
}
