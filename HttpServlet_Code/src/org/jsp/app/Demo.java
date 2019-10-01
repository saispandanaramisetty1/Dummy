package org.jsp.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/dummy")
public class Demo extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException 
   {
      System.out.println("inside post");
      String name_html = req.getParameter("nm");
      String gender = req.getParameter("gen");
      System.out.println(name_html+" "+gender);
   }
   
   
   
}




