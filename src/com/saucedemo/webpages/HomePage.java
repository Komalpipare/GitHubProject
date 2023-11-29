package com.saucedemo.webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 
{
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement addtocart;
	
	@FindBy(className="shopping_cart_link")
	WebElement gotocart;
	
	@FindBy(xpath=".//div[text()='Sauce Labs Backpack']")
	WebElement verifyproduct;
	
	@FindBy(xpath=".//select[@class='product_sort_container']")
	WebElement filter;
	@FindBy(xpath=".//div[@class='inventory_item_price']")
	List<WebElement> price;
	
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnAddToCart()
	{
		addtocart.click();
	}
	
	public void clickOnGoToCart()
	{
		gotocart.click();
	}
	
	public void checkProductAdded()
	{
		verifyproduct.click();
		//
		boolean value = verifyproduct.isDisplayed();
		if(value)
		{
			System.out.println("product in added");
		}
		else
		{
			System.out.println("product in not added");
		}
	}
	
	public void clickOnFilter()
	{
		Select s = new Select(filter);
		s.selectByValue("lohi");
	}
	
	public void printPrice()
	{
		for(int a=0;a<price.size();a++)
		{
			System.out.print("total no of price_"+price.get(a).getText());
		}
	}
	
	
	
	
	
	

}
