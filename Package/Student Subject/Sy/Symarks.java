package Sy;

import java.util.Scanner;
public class Symarks
{	
	int total,Computertotal,mathstotal,electronicstotal;
	Scanner sc=new Scanner(System.in);
	
	public void input()
	{
		System.out.println("Computer Marks:");
		Computertotal=sc.nextInt();
		System.out.println("Maths Marks:");
		mathstotal=sc.nextInt();
		System.out.println("Electronics Marks:");
		electronicstotal=sc.nextInt();
	

	}
	
	public void cal()
	{
		total=Computertotal+mathstotal+electronicstotal;
	}
	
	public void display()
	{
		System.out.println("Computer Marks:"+Computertotal);
		System.out.println("Maths Marks:"+mathstotal);
		System.out.println("Electronics Marks:"+electronicstotal);
		System.out.println("Total Marks:"+total);
	}
}

