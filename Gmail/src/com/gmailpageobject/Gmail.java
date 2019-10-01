

package com.gmailpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gmail.GmailMain;

public class Gmail extends GmailMain
{
	public static WebElement firstName()
	{
		return driver.findElement(By.name("firstName"));
	}
	public static WebElement lastName()
	{
		return driver.findElement(By.name("lastName"));
	}
	public static WebElement userName()
	{
		return driver.findElement(By.name("Username"));
	}
	public static WebElement password()
	{
		return driver.findElement(By.name("Passwd"));
	}
	public static WebElement confirmPassword()
	{
		return driver.findElement(By.name("ConfirmPasswd"));
	}
	public static WebElement buttons()
	{
		return driver.findElement(By.xpath("//SPAN[@class='RveJvd snByac'][text()='Next']"));
	}
	public static WebElement nextPage()
	{
		return driver.findElement(By.id("yDmH0d"));
	}
	public static WebElement alertForPassword()
	{
		return driver.findElement(By.xpath("//DIV[@class='GQ8Pzc']"));
	}
	public static WebElement email()
	{
		return driver.findElement(By.name("identifier"));
	}
	public static WebElement password1()
	{
		return driver.findElement(By.name("password"));
	}
	public static WebElement loginNext()
	{
		
//	    wait.until(ExpectedConditions.refreshed(
//	        ExpectedConditions.elementToBeClickable(By.xpath("//SPAN[@class='RveJvd snByac'][text()='Next']"))));
//		
			return driver.findElement(By.xpath("//SPAN[@class='RveJvd snByac'][text()='Next']"));
		 
//			  new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.id("checkoutLink")));
//				driver.findElement(By.id("checkoutLink")).click();
//		     return driver.findElement(By.xpath("//SPAN[@class='RveJvd snByac'][text()='Next']"));
		  }
	public static WebElement loginPage()
	{
		return driver.findElement(By.xpath("//div[text()='sai spandana']"));
	}
	
		
	}

