package org.jsp.app;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test extends GenericServlet
{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) 
			throws ServletException, IOException 
	{
            System.out.println("welcome to service");		
	}
   
}
