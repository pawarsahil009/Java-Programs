import java.util.*;
abstract class Staff
{
	String name;
	String address;
	double netsal;

	Staff(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	void show()
	{
		System.out.println("Staff Member Name:"+name);
		System.out.println("Staff Member Address:"+address);
	}
	abstract void calsal();

	abstract void display();
}

class FullTimeStaff extends Staff
{
	String dept;
	int sal;
	int noofdays;
	
	FullTimeStaff(String name, String address, String dept, int sal, int noofdays)
	{
		super(name,address);
		this.dept=dept;
		this.sal=sal;
		this.noofdays=noofdays;
	}
	
	@Override
	void calsal()
	{
		netsal=(sal/25)*noofdays;
	}
	
	@Override
	void display()
	{
		System.out.println("Full Time Staff Member");
		System.out.println("Department:"+dept);
		System.out.println("Salary:"+netsal);
	}
}

class PartTimeStaff extends Staff
{
	int numberofhours;
	int rateperhour;
	PartTimeStaff(String name,String address,int numberofhours,int rateperhour)
	{
		super(name,address);
		this.numberofhours=numberofhours;
		this.rateperhour=rateperhour;
	}
	
	@Override
	void calsal()
	{
		netsal=numberofhours*rateperhour;
	}
	
	@Override
	void display()
	{
		System.out.println("Part Time Staff Member");
		System.out.println("Number Of Hours:"+numberofhours);
		System.out.println("Hour Rate:"+rateperhour);
		System.out.println("Salary:"+netsal);
	}
}

class StaffAccount
{
	public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Select Option \n1.Full Time Staff \n2.Part Time Staff");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Display Full Time Staff Information:");
				FullTimeStaff f1=new FullTimeStaff("Sahil","Nashik","Accounts",50000,22);
				f1.calsal();
				f1.show();
				f1.display();
				break;
			case 2:
				System.out.println("Display Part Time Staff Information:");
				PartTimeStaff f2=new PartTimeStaff("Vedant","nashik",500,30);
				f2.calsal();
				f2.show();
				f2.display();
				break;
		}
		
	}
}










		