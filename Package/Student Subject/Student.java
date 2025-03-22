import java.util.*;
import Sy.Symarks;
import Ty.Tymarks;
class Student
{	
		Scanner sc=new Scanner(System.in);
		int rollno;
		String name;
		Symarks s=new Symarks();
		Tymarks t=new Tymarks();

		void accept()
		{
			System.out.println("Enter Roll-No:");
			rollno=sc.nextInt();
			System.out.println("Enter Name:");
			name=sc.next();
		}
		
		void put()
		{
			System.out.println("Roll-No: "+rollno);
			System.out.println("Name: "+name);
			s.input();
			s.cal();
			s.display();
		}

		
		void printty()
		{
			System.out.println("Enter Roll-No:");
			rollno=sc.nextInt();
			System.out.println("Enter Name:");
			name=sc.next();
		}

		void showty()
		{
			System.out.println("Roll-No: "+rollno);
			System.out.println("Name: "+name);
			t.print();
			t.show();
		}
	
}