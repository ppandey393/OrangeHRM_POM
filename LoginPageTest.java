package pageObjectModel;

import org.junit.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends BaseClass{
	
	@Test (priority=1)
	public void verifyUrl() 
	{
		String url = lp.getAppUrl();
	    Assert.assertTrue("Test Fail: Title Url mismatched",url.contains("live"));
		System.out.println("Test Pass: Title URL is matched correctly as: "+url);
	}
	
	@Test (priority=2)
	public void verifyTitle() 
	{
		String title = lp.getAppTitle();
		Assert.assertTrue("Test Fail: Title name mismatched", title.contains("HRM"));
    	System.out.println("Test Pass: Tile name is displayed correctly as: "+title);
 	}

  
	@Test (priority=3)
	public void verifyLogin() 
	{
		lp.doLogin("Admin","admin123");
	}

}
