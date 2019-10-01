package org.jsp.app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LastCodeUsingStroredProcedure 
{

	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String password = "rssai";
		String call_sp = "{call logicalbb3.first_sp()}";
		try 
		{
			Connection conn = DriverManager.getConnection(url, user, password);
			CallableStatement cstmp = conn.prepareCall(call_sp);
			ResultSet rs = cstmp.executeQuery();
			while(rs.next())
			{
				String name = rs.getString("Name");
				String dept = rs.getString("Dept");
				String salary = rs.getString("salary");
				System.out.println(name+" "+dept+" "+salary);
			
			}
		}
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
