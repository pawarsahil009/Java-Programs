import java.util.*;
class RevHollowpy
{
public static void main(String arr[])
{
int n,i,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Numbers of rows:");
n=sc.nextInt();
for(i=n;i>=1;i--)
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