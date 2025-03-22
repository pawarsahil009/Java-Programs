package Ty;

import java.util.Scanner;
public  class Tymarks
{
	int theory,pratical;
	Scanner sc=new Scanner(System.in);

	public void print()
	{
		System.out.println("Enter Theory Marks:");
		theory=sc.nextInt();
		System.out.println("Enter Pratical  Marks:");
		pratical=sc.nextInt();
	}
	
	public void show()
	{
		System.out.println("Theory Marks:"+theory);
		System.out.println("Pratical  Marks:"+pratical);
	}
}