package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ForSingleRecord 
{

	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String password = "rssai";
		String query = "select * from logicalbb3.registrationtable where PhoneNumber='9133422398'";
		try
		{
			//step1
			Connection conn= DriverManager.getConnection(url, user, password);
			//step2
			Statement stmp = conn.createStatement();
			//step3
			ResultSet rs=stmp.executeQuery(query);
			if(rs.next())
			{
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				String gender = rs.getString("gender");
				String emailId = rs.getString("EmailId");
				String phoneNumber =rs.getString("PhoneNumber");
				int age = rs.getInt("Age");
				System.out.println(firstName+" "+lastName+" "+gender+" "+emailId+" "+phoneNumber+" "+age);
			}
			
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
