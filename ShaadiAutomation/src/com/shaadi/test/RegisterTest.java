package com.shaadi.test;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.*;


import com.shaadi.base.Base;
import com.shaadi.page.*;

public class RegisterTest {
	WebDriver driver;
	Base bas;
	Register reg;
	@BeforeClass
	public void beforeClass() throws Exception {
		
		bas=new Base();
		driver=bas.baseMethod();
		reg=new Register(driver);
	}
	
	@Test(priority=1)
	public void verifyElements() throws Exception{
		
		reg=new Register(driver);
		reg.clickBegin();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=2)
	public void registerCredentials()throws Exception
		{
		  reg.registerDetails();	
		  Thread.sleep(5000);
		}
		
	@Test(priority=3)
	public void registerationPanel()throws Exception
		{
		  reg.verifyRegisterPanel();	
		  Thread.sleep(10000);
		}
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		
	}
}
