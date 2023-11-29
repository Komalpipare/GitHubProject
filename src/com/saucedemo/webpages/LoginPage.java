package com.saucedemo.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Declaration
	@FindBy(id="user-name")
	 WebElement username;
	@FindBy(id="password")
	 WebElement password;
	@FindBy(id="login-button")
	 WebElement loginbutton;
	
	
		//Initialization
	WebDriver driver;
		public LoginPage(WebDriver driver)
		{
			driver=driver;
			PageFactory.initElements( driver,this);
		}
		
		
		
		//Utilization
		public void enterUsername(String un)
		{
			username.sendKeys(un);
			
		}
		public void enterPassword(String pwd)
		{
			password.sendKeys(pwd);
		}
		public void clickOnLoginButton()
		{
			loginbutton.click();
		}

	}


