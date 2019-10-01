

package com.gmail;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import com.gmailpageobject.Gmail;
import com.utility.CommonMethods;
import com.utility.ExcelReader;

public class GmailMain 
{
	public static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		System.out.println("enter your choice");
		Scanner scn = new Scanner(System.in);
		int choice = scn.nextInt();
		switch(choice)
		{
		case 1 : registration();
					break;
		case 2 : registerWithInvalidCredentials();
					break;
		case 3 : login();
				break;
		//case 4 : 
		}
		
		
		
		
		

	}
	public static void registration() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
		String firstName = ExcelReader.getExcellData("GmailSheet",1, 2);
		CommonMethods.sendValues(Gmail.firstName(), firstName);
		String lastName = ExcelReader.getExcellData("GmailSheet",1, 3);
		CommonMethods.sendValues(Gmail.lastName(), lastName);
		String userName = ExcelReader.getExcellData("GmailSheet",1, 4);
		CommonMethods.sendValues(Gmail.userName(), userName);
		String password = ExcelReader.getExcellData("GmailSheet",1, 5);
		CommonMethods.sendValues(Gmail.password(), password);
		String confirmPassword = ExcelReader.getExcellData("GmailSheet", 1, 6);
		CommonMethods.sendValues(Gmail.confirmPassword(), confirmPassword);
		
		CommonMethods.click(Gmail.buttons());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String expectedResult = ExcelReader.getExcellData("GmailSheet", 1, 7);
		System.out.println(expectedResult);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String testCaseId = ExcelReader.getExcellData("GmailSheet", 1, 1);
		ExcelReader.setExcelData("GmailOutput",1,1,testCaseId);
		String actualResult = null;
		 if(Gmail.nextPage().isDisplayed())
		 {
			 actualResult = "Registration successful";
			 ExcelReader.setExcelData("GmailOutput", 1, 2, actualResult);
		 }
		
		 if(expectedResult.equals(actualResult))
		 {
			ExcelReader.setExcelData("GmailOutput",1,3,"Pass");	
		 }
		 else
		 {
			ExcelReader.setExcelData("GmailOutput",1,3,"Fail");	
		 }
			
	}
		

	
	public static void  registerWithInvalidCredentials() throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
		String firstName = ExcelReader.getExcellData("GmailSheet",2, 2);
		CommonMethods.sendValues(Gmail.firstName(), firstName);
		String lastName = ExcelReader.getExcellData("GmailSheet",2, 3);
		CommonMethods.sendValues(Gmail.lastName(), lastName);
		String userName = ExcelReader.getExcellData("GmailSheet",2, 4);
		CommonMethods.sendValues(Gmail.userName(), userName);
		String password = ExcelReader.getExcellData("GmailSheet", 2, 5);
		CommonMethods.sendValues(Gmail.password(), password);
		String confirmPassword = ExcelReader.getExcellData("GmailSheet", 2, 6);
		CommonMethods.sendValues(Gmail.confirmPassword(), confirmPassword);
		CommonMethods.click(Gmail.buttons());
		String expectedResult =  ExcelReader.getExcellData("GmailSheet", 2, 7);
//		System.out.println(expectedResult);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualResult = Gmail.alertForPassword().getText();
//		System.out.println(actualResult);
		String testCaseId = ExcelReader.getExcellData("GmailSheet", 2, 1);
		ExcelReader.setExcelData("GmailOutput",2,1,testCaseId);
		System.out.println(testCaseId);
		ExcelReader.setExcelData("GmailOutput",2,2,actualResult);
		
//		System.out.println(actualResult);
		if(expectedResult.equals(actualResult))
		{
			
			ExcelReader.setExcelData("GmailOutput",2,3,"Pass");
		}
		else
		{
			ExcelReader.setExcelData("GmailOutput",2,1,testCaseId);
			ExcelReader.setExcelData("GmailOutput",2,2,actualResult);		
			ExcelReader.setExcelData("GmailOutput",2,3,"Fail");
		}
		

		
	}
	public static void  login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		String email = ExcelReader.getExcellData("Gmailsheet", 3,4);
		CommonMethods.sendValues(Gmail.email(), email);
		CommonMethods.click(Gmail.buttons());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String password = ExcelReader.getExcellData("GmailSheet", 3, 5);
		CommonMethods.sendValues(Gmail.password1(), password);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		CommonMethods.click(Gmail.loginNext());
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String actualResult = null;
		String expectedResult = ExcelReader.getExcellData("GmailSheet", 3, 7);
		Thread.sleep(10000);
		if(Gmail.loginPage().isDisplayed())
		 {
			 actualResult = "LoginSuccessful";
			 ExcelReader.setExcelData("GmailOutput", 3, 2, actualResult);
		 }
		
		 if(expectedResult.equals(actualResult))
		 {
			ExcelReader.setExcelData("GmailOutput",3,3,"Pass");	
		 }
		 else
		 {
			ExcelReader.setExcelData("GmailOutput",3,3,"Fail");	
		 }
		
				
	}
	

	
}