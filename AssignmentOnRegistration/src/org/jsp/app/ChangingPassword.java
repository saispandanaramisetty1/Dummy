package org.jsp.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class ChangingPassword 
{

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		String query = "update logicalbb3.usertable  set Password =? where PhoneNumber=?";
		try 
		{
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement pstmp = conn.prepareStatement(query);
			Scanner scn = new Scanner(System.in);
			System.out.println(" enter the  phoneNumber ");
			String phoneNumber=scn.next();
			pstmp.setString(2, phoneNumber);
			
			System.out.println(" enter the  new Password ");
			String newPassword=scn.next();
			pstmp.setString(1, newPassword);
			pstmp.executeUpdate();

			

			

			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		


	}

}
