package org.java.app;

import java.util.Scanner;

public class Characters
{

	public static void main(String[] args) 
	{
		int count = 1;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String s = scn.next();
		String s1 = "";
		char[] ch = s.toCharArray();
		for(int i=0;i<=ch.length-2;i++)
		{
			for(int j=1;j<=ch.length-2;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[i]=ch[i+1];
					
					ch[j]=ch[j+1];
					if(count!=1)
					{
						s1 = s1+""+count+ch[i];
						System.out.println(s1);
					}
				}
				else
				{
					count=1;
					ch[i]=ch[i+1];
					ch[j]=ch[j+1];	
				}
			}
			
		
				if(count==1)
				{
					s1=s1+""+ch[i];
					System.out.println(s1);
				}
			}
		}
		
	}



