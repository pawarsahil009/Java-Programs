import java.util.*;
class Evenno
{
public static void main(String arr[])
{
int[] number=new int[10];
Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++)
{
System.out.println("Enter the number"+(i+1)+":");
number[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<10;i++)
{
if(number[i]%2==0)
{
sum+=number[i];
}
}
System.out.println("Sum of number is:"+sum);
}
}

