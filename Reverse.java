import java.util.*;
class Reverse
{
public static void main(String arr[])
{
int n,rev=0,rem;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n/=10;
}
System.out.println("Reverse number is:"+rev);
}
}