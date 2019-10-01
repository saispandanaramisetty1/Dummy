package org.jsp.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQL

public class Employee
{
	public static void main(String[] args)
	{
		String url="jdbc:mysql:localhost:3306?user=root&password=rsspa";
		String query="insert into logicaldb3.employee values('Ramisetty','ece',25000.00
		//step1
		Connection conn=DriverManager.getConnection(url);
		System.out.println("step1");
		//step2
		
	}
}