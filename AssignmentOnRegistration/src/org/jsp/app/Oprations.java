package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Oprations 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println(" enter the your choice ");
		int choice = scn.nextInt();
		switch(choice)
		{
		case 1: registration();
				break;
		case 2: updatePhoneNumber();
				break;
		case 3: updateEmailId();
				break;
		}
		

	}
	public static void registration()
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		String query = "insert into logicalbb3.registrationtable values(?,?,?,?,?,?)";
		try 
		{
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement pstmp = conn.prepareStatement(query);
			Scanner scn = new Scanner(System.in);
			System.out.println(" enter the First Name ");
			String firstName = scn.next();
			pstmp.setString(1, firstName);
			System.out.println(" enter the last Name ");
			String lastName = scn.next();
			pstmp.setString(2, lastName);
			System.out.println(" enter the gender ");
			String gender = scn.next();
			pstmp.setString(3, gender);
			System.out.println(" enter the email Id ");
			String emailId = scn.next();
			pstmp.setString(4, emailId);
			System.out.println(" enter the phone number ");
			String phoneNumber = scn.next();
			pstmp.setString(5, phoneNumber);
			System.out.println(" enter the age ");
			int age = scn.nextInt();
			pstmp.setInt(6, age);
			pstmp.executeUpdate();
			

		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		
				
	}
	public static void updatePhoneNumber()
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		String query = "update logicalbb3.registrationtable set PhoneNumber=? where PhoneNumber=?";
		try 
		{
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement pstmp = conn.prepareStatement(query);
			Scanner scn = new Scanner(System.in);
			System.out.println(" enter the  old PhoneNumber ");
			String oldPhoneNumber = scn.next();
			pstmp.setString(2, oldPhoneNumber);
			System.out.println(" enter the NewPhoneNumber ");
			String NewPhoneNumber = scn.next();
			pstmp.setString(1, NewPhoneNumber);
			pstmp.executeUpdate();
			

		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}

	}
	public static void updateEmailId()
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		String query = "update logicalbb3.registrationtable set EmailId=? where EmailId=?";
		try 
		{
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement pstmp = conn.prepareStatement(query);
			Scanner scn = new Scanner(System.in);
			System.out.println(" enter the  old EmailId ");
			String oldEmailId = scn.next();
			pstmp.setString(2, oldEmailId);
			System.out.println(" enter the NewEmailId ");
			String NewEmailId = scn.next();
			pstmp.setString(1, NewEmailId);
			pstmp.executeUpdate();
			

		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}

	}

}
