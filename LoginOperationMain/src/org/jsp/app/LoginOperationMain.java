package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginOperationMain
{

	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String password = "rssai";
		String query = "select user from logicalbb3.usertable where username=? and password=?";
		try 
		{
			Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmp = conn.prepareStatement(query);
			Scanner scn = new Scanner(System.in);
			System.out.println(" enter the user name ");
			pstmp.setString(1, scn.next());
			System.out.println(" enter the password ");
			pstmp.setString(2, scn.next());
			ResultSet rs = pstmp.executeQuery();
			if(rs.next())
			{
				String user1 = rs.getString("user");
				System.out.println(" welcome "+ user1);
			}
			else
			{
				System.out.println(" invalid credentials");
			}
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}

	}

}
