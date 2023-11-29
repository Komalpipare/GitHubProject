package com.saucedemo.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest_Class 
{
	WebDriver driver; 
	@Parameters("browsername")
	@BeforeClass
	public void openBrowser(String browsername)
	{
		if(browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("Chrome"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
	}
	@BeforeMethod
	public void OpenApp()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	} 
	
	@AfterMethod
	public void testResult(ITestResult result)
	{
		if(result.getStatus()==1)
		{
			Reporter.log(result.getName()+"Method is Pass",true);
		}
		else
		{
			Reporter.log(result.getName()+"Method is Fail",true);
		}
		
	}
	@AfterClass
	public void CloseApp()
	{
		driver.close();

}
	
}



