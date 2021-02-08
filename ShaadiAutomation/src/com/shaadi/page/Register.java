package com.shaadi.page;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Register{

	public WebDriver driver;
	By letsBegin=By.xpath("//*[@id=\'___gatsby\']/div/div[1]/div[2]/div/div/form/div/div[3]/button");
	By emailAddress = By.name("email");
	By password = By.name("password1");
	By profileCreator = By.cssSelector(".Dropdown-placeholder");
	By brother = By.xpath("//*[@id=\'___gatsby\']/div/div[7]/form/div[2]/div[3]/div/div[2]/div[4]");
	By next = By.cssSelector(".btn");
	By community = By.cssSelector(".Dropdown-placeholder.is-selected"); 

	public Register(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickBegin()
	{
		driver.findElement(letsBegin).click();
	}
	public void registerDetails()
	{
		driver.findElement(emailAddress).sendKeys("Test987@yopmail.com");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(profileCreator).click();
		driver.findElement(brother).click();
		driver.findElement(next).click();
	}
	public void verifyRegisterPanel() 
	{
		String comm= driver.findElement(community).getText();
		String Url = driver.getCurrentUrl();
		if(Url.equalsIgnoreCase("www.marathiShaadi.com"))
				{
		Assert.assertEquals(comm, "Marathi", "Mother Tongue is not matched");
				}
		else if(Url.equalsIgnoreCase("www.gujaratiShaadi.com"))
		{
			Assert.assertEquals(comm, "Gujarati", "Mother Tongue is not matched");
		}
		else
			System.out.print("Please use Community Website");
		
	}
	
}

