package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageObjectModel extends PageObjectModelMain
{
	public static WebElement firstName()
	{
		return driver.findElement(By.name("first_name"));
	}
	public static WebElement lastName()
	{
		return driver.findElement(By.name("last_name"));
	}
}
