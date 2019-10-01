package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchCodeCase2 
{

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		String query1 = "insert into logicalbb3.employee values('swathi','cse',32556.00)";
		String query2 = "update logicalbb3.usertable set password='sai481'";
		String query3 = "delete from logicalbb3.employee where dept='eee'";
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
