import java.util.*;
class Person
{
	float height;
	String name;
	Scanner sc=new Scanner(System.in);

	void input()
	{
		System.out.println("Enter person Name:");
		name=sc.next();
		System.out.println("Enter person Height:");
		height=sc.nextFloat();
	}
	
	void show()
	{
		System.out.println("Person Name:"+name);
		System.out.println("Person Height:"+height);
	}
		
	Person compare(Person obj)
	{
		if(height>obj.height)
		{
			return this;
		}else{
			return obj;
		}
	}
}
class PersonHeight
{
	public static void main(String arr[])
	{
		Person p1=new Person();
		p1.input();
		Person p2=new Person();
		p2.input();
		Person p3=new Person();
		p3=p1.compare(p2);
		p3.show();
	}
}		