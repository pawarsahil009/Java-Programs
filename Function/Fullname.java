import java.util.*;
class Fullname
{
	public static void main(String ar[])
	{
		String fullname,finalname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name:");
		fullname=sc.nextLine();
		
		char f1=fullname.charAt(0);
		int pos=fullname.indexOf(" ");
		char s1=fullname.charAt(pos+1);
		int lpos=fullname.lastIndexOf(" ");
		String lname=fullname.substring(lpos+1);
	
		finalname=f1+"."+s1+"."+lname;
		System.out.println("FinalName is: "+finalname);
	}
}