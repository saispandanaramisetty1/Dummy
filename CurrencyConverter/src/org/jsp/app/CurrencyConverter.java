package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CurrencyConverter extends GenericServlet
{
	
double dollar;
public void init(ServletConfig config) throws ServletException
{
	String s  = config.getInitParameter("key");
	 dollar = Double.parseDouble(s);
}

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String money = req.getParameter("ea");
		double currency = Integer.parseInt(money);
		double converter = (currency/dollar);
		PrintWriter pw = resp.getWriter();
		pw.println("<html><body>"+converter+"</body></html>");
		
		
	}

}
