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
		
	void compare(Person obj)
	{
		if(height>obj.height)
		{
			show();
		}else{
			obj.show();
		}
	}
}
class PersonHeightb
{
	public static void main(String arr[])
	{
		Person p1=new Person();
		p1.input();
		Person p2=new Person();
		p2.input();
		p1.compare(p2);
	}
}		