package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//Every POM is based on encapsulation = data+method
	
	private WebDriver driver;
	
	//constructor to initialize driver
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	//Locators
	private By user = By.name("username");
	private By pass = By.name("password");
	private By button = By.xpath("//button[@type='submit']");
	
	//Methods
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String un, String pws)
	{
		driver.findElement(user).sendKeys(un);
		driver.findElement(pass).sendKeys(pws);
		driver.findElement(button).click();
	}

}