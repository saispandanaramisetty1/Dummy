
package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.gmail.GmailMain;

public class CommonMethods extends GmailMain
{
	public static void click(WebElement element)
	{
		element.click();
	}
	public static void sendValues(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public static void waitFor() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
