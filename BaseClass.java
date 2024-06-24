package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	
	//Scenario is for one class, so we use beforeclass
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
