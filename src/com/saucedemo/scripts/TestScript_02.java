package com.saucedemo.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.saucedemo.generics.Map;
import com.saucedemo.generics.PropertyFile;
import com.saucedemo.webpages.HomePage;
import com.saucedemo.webpages.LoginPage;

public class TestScript_02 extends BaseTest_Class

{
	@Test
	public void addtoCart()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get(PropertyFile.getDataFromPropertyFile("url"));
		
		LoginPage rv = new LoginPage(driver);
		Map.readDataToMap("LoginPage");
		
		rv.enterUsername(Map.getDataFromMap("username"));
		rv.enterPassword(Map.getDataFromMap("password"));
		rv.clickOnLoginButton();
		
		HomePage rv1 = new HomePage(driver);
		rv1.clickOnAddToCart();
		rv1.clickOnGoToCart();
		rv1.checkProductAdded();
		rv1.clickOnFilter();
		rv1.printPrice();
		
	}
	
	
}


