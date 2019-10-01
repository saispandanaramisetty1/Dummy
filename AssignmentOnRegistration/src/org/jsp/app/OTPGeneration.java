package org.jsp.app;

import java.util.Random;
import java.util.Scanner;

public class OTPGeneration 
{

	public static void main(String[] args)
	{
		Random rd = new Random();
		int otp = rd.nextInt(10000);
		if(otp<0)
		{
			otp=otp*-1;
			
		}
		System.out.println(otp);
		
		System.out.println("-------------------------------------");
		
		Scanner scn = new Scanner(System.in);
		System.out.println(" enter the otp ");
		int comp = scn.nextInt();
		if(comp==otp)
		{
			System.out.println(" otp verified");
		}
		else
		{
			System.out.println(" wrong otp");
		}

	}

}
