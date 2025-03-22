import java.util.*;
class Employee
{
	String name;
	int id; 
	int perdaysalary;      

	Employee()
	{
	}

	Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}

	void display()
	{
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID:"+id);
	}
}

class TemporaryEmployee extends Employee
{
	int hourmonth, hourrate, overtimehour;
		
	TemporaryEmployee(String nm,int id,int hourrate,int hourmonth,int overtimehour)
	{
                super(nm,id);
		this.hourrate=hourrate;
		this.hourmonth=hourmonth;
		this.overtimehour=overtimehour;
	}

	double calsalary()
	{
		int salary = hourrate*hourmonth;
		int overtime = overtimehour*(hourrate*hourmonth);
		int totsalary = salary + overtime;
		return totsalary;
	}

	void display()
	{
		System.out.println("Temporary Employee ");
		super.display();
		System.out.println("Hour Rate"+hourrate);
		System.out.println("Salary  "+calsalary());
	}

}

class PermanentEmployee extends Employee
{
	int salary, noofdays;

	PermanentEmployee(String nm,int id,int salary,int noofdays)
	{
		super(nm,id);
		this.salary=salary;
		this.noofdays=noofdays;
	}
	
	void calsalary()
	{
		perdaysalary=(salary/25)*noofdays;
	}

	void display()
	{
		System.out.println("Permanent Employee");
		super.display();
		System.out.println("Working Days in Month "+noofdays);
		System.out.println("Salary "+perdaysalary);
	}

	
}

class EmployeeAccount
{
	public static void main(String arr[])
	{
		TemporaryEmployee t1 = new TemporaryEmployee("Vedant",101,20,200,20);
		t1.calsalary();
		t1.display();
		System.out.println("");
		PermanentEmployee t2 = new PermanentEmployee("Sahil",102,15000,21);
		t2.calsalary();
		t2.display();
	}
}