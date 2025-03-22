import java.util.*;
class HollowPy
{
public static void main(String arr[])
{
int n,i,k,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=i;j<=n;j++)
{
System.out.print(" ");
}
for(k=1;k<=(2*i-1);k++)
{
if(k==1 || k==(2*i-1) || i==n)
{
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}
}
}
