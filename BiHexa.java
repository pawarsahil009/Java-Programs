import java.util.*;
class BiHexa
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
System.out.println("Menu: \n1.Binary \n2.Hexadecimal");
System.out.println("Enter your choice:");
int choice=sc.nextInt();
switch (choice){
case 1:
String rem="";
int temp=num;
while(temp>0){
rem=(temp%2)+rem;
temp=temp/2;
}
System.out.println("Binary Equivalent:"+rem);
break;
default:
System.out.println("Invalid choice");
}
}
}
