package com.shaadi.base;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base  {
	
public WebDriver baseMethod() throws Exception 
	{
	@SuppressWarnings("resource")
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please enter Community(Marathi/Gujarati)");
    String community = myObj.nextLine();
	System.setProperty("webdriver.chrome.driver","D:\\chromeDriver\\chromedriver.exe");			
	WebDriver driver = new ChromeDriver();
	
	if(community.equalsIgnoreCase("marathi"))
	{
	driver.get("http://www.marathiShaadi.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	}
	else if(community.equalsIgnoreCase("gujarati"))
	{
	driver.get("http://www.gujaratiShaadi.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	}
	else
		System.out.print("Invalid Community");
	return driver;
	}


public Base()
	{
	}
}
