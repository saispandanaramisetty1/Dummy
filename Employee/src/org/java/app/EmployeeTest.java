package org.java.app;

	import java.util.Scanner;


	//user defined exception
	class InvalidException extends Exception {
		String s;
		InvalidException() {
			
		}
		
		InvalidException(String s) {
			this.s=s;
		}
		
		public String toString() {
			return s;
		}
		
	}

    //initialization of employee class
	class Employee
	{ 
		String name;
		int age;
		Employee Next;
		Employee(String name,int age) 
		{
			this.name=name;
			this.age = age;
			Next=null;
		}
	}


	//main class 
	class EmployeeTest 
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int choice=0;
			int age=0;
			String name=null;
			while(true)
			{
				System.out.println("what operations do you want to perform");
				System.out.println("1.add 2.display");
				choice = sc.nextInt();
				switch(choice)
				{
					case 1:	try 
							{
								System.out.println("enter the age");
								age = sc.nextInt();
								checkingAge(age);
								System.out.println("enter the name to add"); 
								name= sc.next();
								checkingName(name);
							} 
							catch(InvalidException e) 
							{
								System.out.println(e);
						        break;
							}
							Employee newadd1 = new Employee(name,age);
							add_last(newadd1);
							break;
					case 2: display();
							break;
						
					default: System.out.println("Enter the correct choice");
						
						
				}
			}
			
		}
		
		//checking the name
		private static void checkingName(String name) throws InvalidException 
		{
			Employee temp=head;
			for(;temp!=null;temp=temp.Next) 
			{
				if((temp.name).equals(name)) 
				{
					throw new InvalidException("Name is already exists");
				}
				
			}
			
		}
		static Employee head = null;
		//for printing the values
		private static void display()
		{
			Employee temp=head;
			if(temp==null) 
			{
				System.out.println("The list is empty");
			}
			while(temp!=null) 
			{
				System.out.println("The name is: "+temp.name);
				System.out.println("age is: "+temp.age);
				temp=temp.Next;
			}
			
		}
		//adding the elements at last
		private static void add_last(Employee newadd1)
		{
			if(head==null) 
			{
				newadd1.Next=head;
				head=newadd1;
				
			}
			else 
			{
				Employee temp=head;
				for(temp=head;temp.Next!=null;temp=temp.Next);
				temp.Next=newadd1;
				newadd1.Next=null;
			}
		}
		//checking the age
		public static  void checkingAge( int age) throws InvalidException
		{
			if((age < 0 || age >60 ))
			{
				throw new InvalidException("check the age once");
			}
				
		}
		
	}


