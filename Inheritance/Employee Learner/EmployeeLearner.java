import java.util.*;
class Employee 
{
	int empno,salary;
	String name;
		
	Employee()
	{
	}
	
	Employee(String name,int empno,int salary)
	{
		this.name=name;
		this.empno=empno;
		this.salary=salary;
	}
	
	public void display()
	{
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Number:"+empno);
		System.out.println("Employee Salary:"+salary);
	}
}

interface Learner 
{
	 void admit();
	 void exam();
}

class LearningEmp extends Employee implements Learner
{
	int date,examdate;
	String course;
	
	LearningEmp(String name,int empno,int salary,int date,String course,int examdate) 
	{
		super(name,empno,salary);
		this.date=date;
		this.course=course;
		this.examdate=examdate;
	}
	
	public void admit()
	{
		System.out.println("Course Name:"+course);
		System.out.println("Course admission date:"+date);
	}
	
	public void exam()
	{
		System.out.println("Course Exam Date:"+examdate);
	}
}
class EmployeeLearner
{
	public static void main(String arr[])
	{
		LearningEmp e1=new LearningEmp("Sahil",10,30000,19,"Java",20);
		e1.display();
		e1.admit();
		e1.exam();
	}
}
		