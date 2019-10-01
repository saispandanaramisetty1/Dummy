package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcCodeForRegistration 
{
	public void registerJdbc(String fname,String lname,String mnumber,String pass)
	  {
		  String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
		  String query = "insert into registerdb.registration values(?,?,?,?,?)";
		  
		  try 
		  {
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection conn = DriverManager.getConnection(url);
			
			PreparedStatement pstmp = conn.prepareStatement(query);
			
			//setting values for placeholders
			pstmp.setString(1, fname);
			pstmp.setString(2, lname);
			pstmp.setString(3, mnumber);
			pstmp.setString(4, pass);
	        pstmp.executeUpdate();
	        
	        conn.close();
	        System.out.println("registered");
		  } 
		  catch (SQLException | ClassNotFoundException e) 
		  {
			e.printStackTrace();
		  }
	  }
}
	    
