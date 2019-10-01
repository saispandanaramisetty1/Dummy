package org.jsp.app;

public class Employee extends Object
{
	public String name;
	public String dept;
	public double salary;
	public Employee(String name,String dept,double salary)
	{
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
	
	}
