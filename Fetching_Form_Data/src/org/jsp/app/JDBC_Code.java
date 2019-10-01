package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Code
{
  public void registerJdbc(String fname,String lname,int age,String uname,String pass)
  {
	  String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
	  String query = "insert into registerdb.sample values(?,?,?,?,?)";
	  
	  try 
	  {
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection conn = DriverManager.getConnection(url);
		
		PreparedStatement pstmp = conn.prepareStatement(query);
		
		//setting values for placeholders
		pstmp.setString(1, fname);
		pstmp.setString(2, lname);
		pstmp.setInt(3, age);
		pstmp.setString(4, uname);
		pstmp.setString(5, pass);
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
