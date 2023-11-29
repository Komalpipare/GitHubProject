package com.saucedemo.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.saucedemo.generics.Map;
import com.saucedemo.generics.PropertyFile;
import com.saucedemo.webpages.LoginPage;

public class TestScript_01 extends BaseTest_Class
{
	@Test
	public void SauceDemoLogin()
	{
		WebDriver driver= new FirefoxDriver();
		driver.get(PropertyFile.getDataFromPropertyFile("url"));
		
		
		LoginPage rv=new LoginPage(driver);
		
		
		Map.readDataToMap("LoginPage");
		rv.enterUsername(Map.getDataFromMap("username"));
		rv.enterPassword(Map.getDataFromMap("password"));
		rv.clickOnLoginButton();
	}
	

}
