package org.jsp.app;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Form extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String fName = req.getParameter("fn");
		String pNumber = req.getParameter("pn");
		if((fName.length()>=8&&fName.length()<=12))
		{
			for(int index=0;index<=fName.length()-1;index++)
			{
				char ch = fName.charAt(index);
				int ascii = ch;
				if((ascii>=97&&ascii<=122)||(ascii>=65&&ascii<=90))
				{
					System.out.println("firstname contains only alphabets");
				}
				else
				{
					System.out.println("invalid firstName");
				}
			}
		}
		if((pNumber.length()==10))
		{
			for(int index=0;index<=pNumber.length()-1;index++)
			{
				char ch = pNumber.charAt(index);
				int ascii = ch;
				if(ascii>=47&&ascii<=56)
				{
					System.out.println("phone number is in correct rage");
				}
				else
				{
					System.out.println("phone number should contain 10 digits only");
				}
			}
		}
	}

}
