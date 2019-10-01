package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletResponse;

public class JdbcCodeForLogin
{
 public void codeForLogin(String mNumber,String pass,ServletResponse resp)
 {
	 String url = "jdbc:mysql://localhost:3306?user=root&password=rssai";
	  String query = "select firstname from registerdb.registration where MobileNumber=?andPassword=?";
	  
	  try 
	  {
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection conn = DriverManager.getConnection(url);
		
		PreparedStatement pstmp = conn.prepareStatement(query);
		
		//setting values for placeholders
		pstmp.setString(1, mNumber);
		pstmp.setString(2, pass);
       ResultSet rs=pstmp.executeQuery();
       PrintWriter pw=resp.getWriter();
       if(rs.next())
       {
    	   String firstname=rs.getString("firstname");
    	   pw.println("<html><body><h1>login sucessfully</h1?</body></html>");
       }
       else
       {
    	   pw.print("<html><body><h1>Invalid credential<br><a href='LoginPage.html'>click here to login</a></h1></body></html>");
       }
       
       conn.close();
       System.out.println("login");
	  } 
	  catch (SQLException | ClassNotFoundException | IOException e) 
	  {
		e.printStackTrace();
	  }

 }
}
