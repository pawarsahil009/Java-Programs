import java.util.*;
Class Triangle
{
	float ht,bs,ar;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height:");
		ht=sc.nextFloat();
		System.out.println("Enter the base:");
		bs=sc.nextFloat();
	}
	float area()
	{
		ar=0.5f*ht*bs;
		return ar;
	}
	void show()
	{
		System.out.println("Height:"+ht);
		System.out.println("Base:"+bs);
		System.out.println("Area:"+ar);
	}
}
class SumofTriangle
{
	public static void main(String arr[])
	{
		Triangle t1=new Triangle();	
		Triangle t2=new Triangle();
		Triangle t3=new Triangle();
		System.out.println("Enter for 1st traingle:");
		t1.input();
		System.out.println("Enter for 2nd traingle:");
		t2.input();
		System.out.println("Enter for 3rd traingle:");
		t3.input();
		float sum=t1.area()+t2.area()+t3.area();
		System.out.println("Sum is:"+sum);
	}
}