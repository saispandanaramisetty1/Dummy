package org.jsp.app;

import java.util.Scanner;

public class LoginInThreeDifferentForms 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur choice");
		int choice = scn.nextInt();
		switch(choice)
		{
		case 1: normalLogin();
				break;
				
		case 2: loginUsingMailOrPhoneNumber();
				break;
		
		case 3:loginUsingOtp();
				break;
		}
	}
		public static void normalLogin()
		{
			String url = "jdbc:mysql://localhost:3306?user";
		}
		public static void loginUsingMailOrPhoneNumber()
		{
			
		}
		public static void loginUsingOtp()
		{
			
		}
		

	}


