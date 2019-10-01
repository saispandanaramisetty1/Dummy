package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MatchingPasswords 
{
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		String query = "insert into logicalbb3.usertable values(?,?,?)";
		try 
		{
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement pstmp = conn.prepareStatement(query);
			Scanner scn = new Scanner(System.in);
			System.out.println(" enter the user ");
			String user = scn.next();
			pstmp.setString(1,user);
			System.out.println(" enter the user name");
			String userName = scn.next();
			pstmp.setString(2, userName);
			System.out.println(" enter the password ");
			String password = scn.next();
			System.out.println(" enter the confirm password");
			String confirmPassword = scn.next();
			if(password.equals(confirmPassword))
			{
				pstmp.setString(3,confirmPassword);
				pstmp.executeUpdate();
			}
			else
			{
				System.err.println(" Password Mismatch");
			}
			
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}
}
