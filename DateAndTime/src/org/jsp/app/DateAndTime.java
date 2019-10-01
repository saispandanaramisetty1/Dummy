package org.jsp.app;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateAndTime extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat();
	  System.out.println(s.getDateInstance());
	  System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
	}

}
