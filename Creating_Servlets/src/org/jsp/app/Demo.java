package org.jsp.app;

import java.io.IOException;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException 
	{
        System.out.println("inside service");
        Date d1 = new Date();
        System.out.println(d1.getDate());
	}
  
}





