package org.jsp.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/iphone")
public class SourceServlet extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException
   {
	  if(req.getParameter("pwd").equals(req.getParameter("cpwd")))
	  {
		 RequestDispatcher rd = req.getRequestDispatcher("success.html");
		 rd.include(req, resp);
	  }
	  else
	  {
		  RequestDispatcher rd = req.getRequestDispatcher("failure.html");
	      rd.include(req, resp);
	  }
   }
}



