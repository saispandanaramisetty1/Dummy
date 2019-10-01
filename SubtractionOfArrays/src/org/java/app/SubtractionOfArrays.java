package org.java.app;

import java.util.Scanner;

public class SubtractionOfArrays
{

	public static void main(String[] args) 
	{
		//initializing the scanner class
		Scanner scn = new Scanner(System.in);
		
		//declaring the arrays 
		int[] array1 = initializingArray(scn,"first");
		printingArray(array1);
		
		int[] array2 = initializingArray(scn,"second");
		printingArray(array2);
		
		//subtracting arrays
		int resultArray[];
		if(array1.length>array2.length||array1.length==array2.length)
		{
			resultArray = new int[array1.length];
		}
		else
		{
			resultArray = new int[array2.length];
		}
		int borrow = 0;
		for(int i=0;i<=resultArray.length-1;i++)
		{
			int firstTerm,secondTerm,newTerm;
			firstTerm = (array1.length-1-i)<0?0:array1[array1.length-1-i];
			secondTerm = (array2.length-1-i)<0?0:array1[array2.length-1-i]; 
			if(array1.length>array2.length||array1.length==array2.length) 
			{
				if(firstTerm>secondTerm||firstTerm==secondTerm)
				{
					 newTerm = firstTerm-secondTerm;
					 resultArray[resultArray.length-1-i] = newTerm;
				}
				
			}
			else
			{
				int[] temp = {};
				for(int j=0;j<=array1.length-1;j++)
				{
					temp[j] = array1[j];
				}
				for(int j=0;j<=array2.length-1;j++)
				{
					array1[j] = array2[j];
				}
				for(int j=0;j<=temp.length-1;j++)
				{
					array1[j] = temp[j];
				}
			}
			
		}
		printingArray(resultArray);
		
		
		//closing the scanner class
		scn.close();
		

	}
	
	//intializing the arrays
	public static int[] initializingArray(Scanner scn,String nth)
	{
		//reading the size of the array
		System.out.println("enter the size of "+nth+" array");
		int size = 0;
		try 
		{
			size = scn.nextInt();

		} 
		catch (Exception e) 
		{
		System.out.println(" size should be  the integer ");
		
		}
		int array[] = {};
		if(size>=0)
		{
			array = new int[size];
			System.out.println(" Enter the elements of "+nth+" array ");
		}
		else
		{
			System.out.println(" size should be greter than zero");
		}

			
			//reading the values for array
			for(int i=0;i<=array.length-1;i++)
			{
				try
				{
					array[i] = scn.nextInt();
					while(array[i]<0||array[i]>9)
					{
						System.out.println("  invalid element ");
						array[i] = scn.nextInt();
					}
				} 
				catch (Exception e) 
				{
					System.out.println("  invalid element ");
								
				}
			}
				return array;
	}
				
			public static void printingArray(int[] printArray)
			{
				for(int i=0;i<=printArray.length-1;i++)
				{
					System.out.print(printArray[i]+" ");
					
				}
				System.out.println();
			}
			
		
	
				
}


