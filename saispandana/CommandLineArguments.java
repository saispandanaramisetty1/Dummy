package org.java.app;

public class CommandLineArguments
{
	public static void main(String[] args)
	{
		int hours=0;
		String[] split = args[0].split("[, ]");
		for(int i = 0; i < split.length; i++)
		{
			int day=0;
			int hours1=0;
			String[] split1 = split[i].split("-");
				
			//converting string to int
			int data=Integer.parseInt(split1[1]);
				
			//caluculating the time taken by individual course to complete
			hours=hours+data;
			day=data/8;
			hours1=data%8;
			System.out.println("course name  "+split1[0]+" - "+day+" days "+hours1+" hours ");
		}
			
		//caluculating the total time taken by all courses to complete
		int day1=hours/8;
		int hours2=hours%8;
		System.out.println("total days to complete all courses " +day1+"days and "+hours2+"hours");
			
	}

}


