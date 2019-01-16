package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Homepage 
{
	static WebDriverWait w;
	static WebDriver  driver=null;
	@BeforeClass
	public static void launchMethod()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		w =new WebDriverWait(driver,20);
		driver.manage().window().maximize();
		driver.get("https://www.olx.in");
	}
	@Test(priority=1)
	public static void method()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olx.in");
		//check the website is opened properly or not
		WebElement e =driver.findElement(By.id("headerLogo"));
		if(e.isDisplayed())
		{
			Reporter.log("website launch test passed");
			Assert.assertTrue(true);
		}
		else
		{
			Reporter.log("website launch test failed");
			Assert.assertTrue(false);
		}
	}
	@Test(priority=2)
	public static void method2()
	{
		//to test submit a free ad link
		w.until(ExpectedCondition<ChromeDriver>
		driver.findElement(By.xpath("//*[text()='Submit a Free Ad']")).click();
		WebElement fad =
		
	}
	@AfterClass
	public static void closeMethod()
	{
		driver.close();
	}
}
