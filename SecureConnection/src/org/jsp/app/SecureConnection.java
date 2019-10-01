package org.jsp.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SecureConnection 
{

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306";
		try
		{
			FileReader fr = new FileReader("src/org/jsp/app/CredentialsForSecureConnection/userandpassword");
			Properties prop = new Properties();
			prop.load(fr);
			Connection conn = DriverManager.getConnection(url, prop);
			fr.close();
			System.out.println("step1");
			
		}
		catch (IOException | SQLException e) 
		{
			
			
			e.printStackTrace();
		}

	}

}
