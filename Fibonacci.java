import java.util.*;
class Fibonacci
{
public static void main(String arr[])
{
int n,n1=0,n2=1,n3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms:");
n=sc.nextInt();
System.out.println("Fibonacci series is:");
for(int i=2;i<=n;i++)
{
n3=n1+n2;
System.out.println(" "+n1);
n1=n2;
n2=n3;
}
}
}