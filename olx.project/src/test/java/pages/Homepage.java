package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Homepage 
{
	static WebDriver  driver=null;
	@Test()
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
	@AfterClass
	public static void method2()
	{
		driver.close();
	}
}
