package org.java.app;

import java.util.Scanner;

public class MirrorImage 
{
	static int len;
	static int count=0;
	static String s;
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string length");
		 len = scn.nextInt();
		if((len>=3&&len<=5000))
		{
			System.out.println("enter the string");
			 s = scn.next();
			for(int index=0;index<=s.length()-1;index++)
			{
				char c = s.charAt(index);
				int ascii = c;
				if((ascii>=97&&ascii<=122)||(ascii>=47&&ascii<=56))
				{
					char[] ch = s.toCharArray();
					for(int i=0;i<=ch.length-1;i++ )
					{
						for(int j=ch.length-1;j>=0;j--)
						{
							if(ch[i]!=ch[j])
							{
								count++;
							}
						}
						System.out.println(count);
					}
					

				}
				else
				{
					System.out.println("enter the  string which consits of alphabets and numbers only");
					s = scn.next();
				}
			}
			
		}
		else
		{
			System.out.println("length should be in between 3 to 5000");
			len = scn.nextInt();
		}

	}

}
