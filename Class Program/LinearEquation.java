import java.util.*;
class Linear
{
	int var1,var2;
	Scanner sc=new Scanner(System.in);

	void input()
	{
		System.out.println("Enter Value one:");
		var1=sc.nextInt();
		System.out.println("Enter value two:");
		var2=sc.nextInt();
		
       }

	void show()
	{	
		System.out.println(" Linear equation:"+var1+"x"+"+"+var2+"y");
	}
	
	void addition(Linear o1,Linear o2)
	{
		this.var1=o1.var1+o2.var1;
		this.var2=o1.var2+o2.var2;
	}
}
class LinearEquation
{
	public static void main(String arr[])
	{
		Linear l1=new Linear();
		l1.input();
		Linear l2=new Linear();
		l2.input();
		Linear l3=new Linear();
		l3.addition(l1,l2);
		System.out.println("\nLinear equation 1");
		l1.show();
		System.out.println("\nLinear equation 2");
		l2.show();
		System.out.println("\nLinear equation addition");

		l3.show();
		
	}
}