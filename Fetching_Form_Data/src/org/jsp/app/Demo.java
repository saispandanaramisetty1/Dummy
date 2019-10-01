package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

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
		String firstName = req.getParameter("fn");
		String lastName = req.getParameter("ln");
		String age = req.getParameter("ag");
		String username = req.getParameter("un");
		String password = req.getParameter("pwd");
		String confirm_password = req.getParameter("cpwd");

		PrintWriter pw = resp.getWriter();
		if(password.equals(confirm_password))
		{
			JDBC_Code jc = new JDBC_Code();
			jc.registerJdbc(firstName, lastName, Integer.parseInt(age),username,password);
			System.out.println("registration successfull");
			
			pw.println("<html><body><h1>registration successfull</h1>"+"</body></html>");
		}
		else
		{
			System.out.println("registration unsuccessfull");
			pw.println("<html><body><h1>registration unsuccessfull<br><a href='Register.html'>Homepage</a></h1></body></html>");
		}
		
		
	}

}






