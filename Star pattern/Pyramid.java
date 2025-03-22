import java.util.*;
class Pyramid
{
public static void main(String arr[])
{
int n,i,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers of rows:");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=i;j<=n;j++)
{
System.out.print(" ");
}
for(k=1;k<=(2*i-1);k++)
{
System.out.print("*");
}
System.out.println();
}
}
}