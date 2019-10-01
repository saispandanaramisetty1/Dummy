package org.jsp.app;

	
	public class Employee
	{
		public static void main(String[] args) 
		{
			Thread t = new E(this);
			t.start();
		}
		public void run()
		{
			System.out.println("test");
		}
	}
	
		

	