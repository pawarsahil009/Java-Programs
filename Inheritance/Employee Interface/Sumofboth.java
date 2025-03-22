import java.util.*;
interface Compute
{
	void area();
	void perimeter();
	float pi=3.14f;
}
class Circle implements Compute
{
	float radius;
	float area_of_circle;
	float perimeter_of_circle;
	
	Circle(float radius)
	{
		this.radius=radius;
	}

	public void area()
	{
		area_of_circle=pi*radius*radius;
	}
	
	public void perimeter()
	{
		perimeter_of_circle=2*pi*radius;
	}
	
	void display()
	{
		System.out.println("Area of Circle is:"+area_of_circle);
		System.out.println("Area of Perimeter is:"+perimeter_of_circle);
	}
}
class Triangle implements Compute
{
	int a,b,c;
	int area_of_triangle;
	
	Triangle(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void area()
	{
	}
	public void perimeter()
	{
		area_of_triangle=a+b+c;
	}
	
	void display()
	{
		System.out.println("Perimeter of triangle:"+area_of_triangle);			
	}
}
class Sumofboth
{
	public static void main(String arr[])
	{
		Circle s1=new Circle(4);
		s1.area();
		s1.perimeter();
		s1.display();
		Triangle s2=new Triangle(5,5,5);
		s2.perimeter();
		s2.display();
	}
}




