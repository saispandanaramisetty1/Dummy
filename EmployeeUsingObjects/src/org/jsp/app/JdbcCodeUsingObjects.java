package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCodeUsingObjects
{

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		String query = "select * from logicalbb3.employee ";
		try 
		{
			Connection conn = DriverManager.getConnection(url);
			Statement stmp = conn.createStatement();
			ResultSet rs = stmp.executeQuery(query);
			
			while(rs.next())
			{
				Employee emp =new Employee(rs.getString("Name"),rs.getString("Dept"),rs.getDouble("Salary"));
				System.out.println(emp);
			}
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		

	}

}
