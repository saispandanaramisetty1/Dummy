package org.jsp.app;

public class UniqueElements 
{

	public static void main(String[] args) 
	{
		String s1 = "java j2ee html";
		int[] arr = new int[123];
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			int ascii = ch;
			arr[ascii]++;
		}
		for(int in=0;in<=arr.length-1;in++)
		{
			if(arr[in]>0)
			{
				char ot = (char) in;
				System.out.println(ot);
				
			}
		}

	}

}
