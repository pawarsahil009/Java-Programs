import java.util.*;
class Factorial
{
public static void main(String arr[])
{
int n,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the factorial number:");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial of"+n+"is:"+fact);
}
}
