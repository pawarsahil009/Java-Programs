import java.util.*;
class Paisa 
{
public static void main(String arr[])
{
int paisa;
float rupees;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the price of an item in Rupees:");
rupees=sc.nextFloat();
paisa=(int)(rupees*100f);
System.out.println("Price of item in Paisa:"+paisa);
}
}
