import java.util.*;
class Star
{
public static void main(String arr[])
{
int n,j,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers of lines:");
n=sc.nextInt();
for(i=0;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
