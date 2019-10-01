package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String mobileNo=req.getParameter("lmn");
		String password=req.getParameter("lpwd");
		PrintWriter pw=resp.getWriter();
		JdbcCodeForLogin j=new JdbcCodeForLogin();
		j.codeForLogin(mobileNo,password,resp);
		pw.println("<html><body><a href='forgetpassword.html'>forget password</a></body></html>");
	}

}
