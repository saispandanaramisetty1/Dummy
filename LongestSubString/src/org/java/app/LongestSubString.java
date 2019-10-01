package org.java.app;

import java.util.Scanner;

public class LongestSubString 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scn.next();
		String subString = "";
		char[] ch = s.toCharArray();
		char temp = ch[0];
		subString = subString+""+temp;
		for(int i=1;i<=ch.length-1;i++)
		{
			//subString = subString+""+temp;
			//if(temp!=ch[i])
			//{
				//temp = ch[i+1];
				if(!(subString.contains(""+ch[i])))
				{
					subString = subString+""+ch[i];
					ch[i] = ch[i+1];
				
				}
				else
				{
					ch[i] = ch[i+1];
					break;
				
				}
			
		
		}
		System.out.println(subString);
	}

	}


