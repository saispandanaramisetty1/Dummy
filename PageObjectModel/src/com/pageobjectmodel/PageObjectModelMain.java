package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;

public class PageObjectModelMain 
{
	public static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver.get("http://www.yoaspire.com:3000/");
		PageObjectModel.firstName().sendKeys("saispandana");
		PageObjectModel.lastName().sendKeys("ramisetty");
			

	}

}
