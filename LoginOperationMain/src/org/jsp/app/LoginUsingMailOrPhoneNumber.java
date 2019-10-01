package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginUsingMailOrPhoneNumber
{

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		String query = "select user from logicalbb3.usertable where (password=?and(emailid=? or phonenumber=?))";
		try 
		{
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement pstmp = conn.prepareStatement(query);
			Scanner scn = new Scanner(System.in);
			System.out.println(" enter the password ");
			pstmp.setString(1, scn.next());
			System.out.println(" enter the emailid or phonenumber ");
			pstmp.setString(2, scn.next());
			pstmp.setString(3, scn.next());
			ResultSet rs = pstmp.executeQuery();
			if(rs.next())
			{
				String user1 = rs.getString("user");
				System.out.println(" welcome "+user1);
			}
			else
			{
				System.out.println(" login is inavalid");
			}
			rs.close();
			scn.close();
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}

	}

}
