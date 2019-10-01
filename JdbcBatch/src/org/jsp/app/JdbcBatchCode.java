package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchCode 
{

	public static void main(String[] args) 
	{
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		String query1 = "insert into logicalbb3.employee values('teja','ece',2000.00)";
		String query2 = "update logicalbb3.employee set salary=1000";
		String query3 = "delete from logicalbb3.employee where dept='cse'";
		try
		{
			Connection conn = DriverManager.getConnection(url);
			Statement stmp = conn.createStatement();
			//adding queries into batch
			stmp.addBatch(query1);
			stmp.addBatch(query2);
			stmp.addBatch(query3);
			stmp.executeBatch();
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		

	}

}
