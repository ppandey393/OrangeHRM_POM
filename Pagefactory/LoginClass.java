package pageObjectModel.Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginClass {
	
	private WebDriver driver;
	public LoginClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators - @FindBy
	@FindBy(name="username")
	private WebElement uName;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	//methods
	public void getUrl()
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("orangehrmlive"), "Test Fail: URL mismatched");
		System.out.println("Test Pass: URL matched: "+url);
	}

	public void getTitle()
	{
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("HRM"), "Test Fail: Title mismatched");
		System.out.println("Test Pass: Title matched: "+title);
	}
	
	public void doLogin(String un, String pws)
	{
		uName.sendKeys(un);
		pass.sendKeys(pws);
		loginbtn.click();
		Assert.assertTrue(false, pws);
		System.out.println("Login Successful!");
	}
}
