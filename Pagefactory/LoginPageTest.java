package pageObjectModel.Pagefactory;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass{
	
	@Test(priority=1)
	public void verifyGetUrl()
	{
		lp.getUrl();
	}
	
  	@Test(priority=2)
	public void verifyGetTitle()
	{
		lp.getTitle();
	}
	
  	@Test(priority=3)
	public void doLogin()
	{
		lp.doLogin("Admin", "admin123");
	}

}
