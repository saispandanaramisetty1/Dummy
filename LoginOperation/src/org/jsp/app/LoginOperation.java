package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginOperation 
{

	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		String query = "select user from logicalbb3.usertable where username=? and Password=?";
		try
		{
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement pstmp = conn.prepareStatement(query);
			Scanner scn = new Scanner(System.in);
			System.out.println(" enter the user name");
			String userName = scn.next();
			pstmp.setString(1, userName);
			System.out.println(" enter the Password");
			String password = scn.next();
			pstmp.setString(2, password);
			System.out.println(" enter the user");
			String user = scn.next();
			
			ResultSet rs= pstmp.executeQuery();
			if(rs.next())
			{
			
			   String login = rs.getString("user");
			   if(login.equals(user))
			   {
				System.out.println("login successful");
			   }
			}
			  else
			   {
				System.err.println(" login unsuccessful");
			   }
			

		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		

	}

}
