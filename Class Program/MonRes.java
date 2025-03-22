import java.util.*;
class Monitor
{
	String 	company, type;
	int resolution;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Company Name:");
		company=sc.next();
		System.out.println("Enter the Type:");
		type=sc.next();
		System.out.println("Enter the resolution:");
		resolution=sc.nextInt();
	}
	void Show()
	{
		System.out.println("Company name:"+company);
		System.out.println("Type:"+type);
		System.out.println("Resolution:"+resolution);	
	}
}
class MonRes
{
public static void main(String arr[])
{	
	Monitor r1=new Monitor();
	Monitor r2=new Monitor();
	r1.input();
	r2.input();
	if(r1.resolution>r2.resolution)
	{
		System.out.println("Monitor1 is better than Monitor2");
	}else{
		System.out.println("Monitor2 is better than Monitor1");
	}
}
}
