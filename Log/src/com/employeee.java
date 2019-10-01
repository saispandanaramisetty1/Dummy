package com;

import java.util.Scanner;

public class employeee {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int choice;
		while(true)
	    {
	    	System.out.println("****MENU***");
	    	System.out.println("1.login\n2.register\n");
	    	System.out.println("enter the choice");
	    	choice=sc.nextInt();
	    }
	    switch(choice)
	    {
	    case 1:System.out.println("enter the employeeId:");
	    		String employeeId1=sc.next();
	    		System.out.println("enter the password:");
	    		String Password=sc.next();
	    	    if (employeeId.equals(employeeid) && password.equals(Password)) {

	    	        System.out.println("Access Granted! Welcome!");
	    	    }

	    	    else if (employeeId.equals(employeeId)) {
	    	        System.out.println("Invalid Password!");
	    	    } else if (password.equals(Password)) {
	    	        System.out.println("Invalid Username!");
	    	    } else {
	    	        System.out.println("Invalid employeeId & Password!");
	    	    }


	    case 2:System.out.println
	   
	    }

	    

	    //users check = new users(username, password);

	    if(EmployeeId.equals(employeeId) && password.equals(password)) 
	        System.out.println("You are logged in");



	}

	}


