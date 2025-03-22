class Student 
{
	int sid;
	String sname;
	void set()
	{
		sid=2112;
		sname="Sahil";
	}
	void print()
	{
		System.out.println("Student id:"+sid);
		System.out.println("Students Name:"+sname);
	}
}
class School
{
	public static void main(String arr[])
	{
		Student s=new Student();
			s.set();
			s.print();
	}
}	