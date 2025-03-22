import java.util.*;
class RevStar
{
public static void main(String arr[])
{
int n,j,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter numbers of lines:");
n=sc.nextInt();
for(i=n;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}