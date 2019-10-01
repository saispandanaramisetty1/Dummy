package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegistrationPage extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException
	{
		String fName = req.getParameter("fn");
		String lName = req.getParameter("ln");
		String mNumber = req.getParameter("mn");
		String password = req.getParameter("pwd");
		String confirmPassword = req.getParameter("cpwd");
		PrintWriter pw = resp.getWriter();
		if(password.equals(confirmPassword))
		{
			JdbcCodeForRegistration jcfr = new JdbcCodeForRegistration();
			jcfr.registerJdbc(fName,lName,mNumber,password);
			pw.println("registration Successful");
			pw.println("<html><body><h1><a href='LoginPage.html'>click here to login</a></h3></body></html>");
			JdbcCodeForLogin jcfl = new JdbcCodeForLogin();
		
		}
		else
		{
			pw.println("registration UnSuccessful");
			pw.println("<html><body><h1><a href='RegistrationPage.html'>click here to register</a></h3></body></html>");
		}
		
	}

}
