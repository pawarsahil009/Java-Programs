import java.util.*;
class Item
{
	int itemno,csl,minl; 
	String desc;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter the number of items:");
		itemno=sc.nextInt();
		System.out.println("Enter description:");
		desc=sc.next();
		System.out.println("Enter Current stock level:");
		csl=sc.nextInt();
		System.out.println("Enter Minimum level:");
		minl=sc.nextInt();
		
	}
	void receipt(int qtyin)
	{
		csl=csl+qtyin;
	}
	void issue(int qtydc)
	{
		if(csl>0){
		System.out.println(csl);
		csl=csl-qtydc;
		}else{
		System.out.println("Invalid");
		}
	}
	void print()
	{
		System.out.println("Number of items:"+itemno);
		System.out.println("Description:"+desc);
		System.out.println("Current stock level:"+csl);
		System.out.println("Minimum level:"+minl);
	}
}
class Stocks
{
public static void main(String arr[])
{	
	Scanner sc=new Scanner(System.in);
	Item i1=new Item();
	int choice,qtyin,qtydc;
	i1.read();
	do{
		System.out.println("Select Option \n1.Stock Increase Level \n2.Stock Decrease Level\n3.Show Stock\n4.Exit");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("1.Enter the number of Quantity which increase:");
			qtyin=sc.nextInt();
			i1.receipt(qtyin);
			break;
			case 2:
			System.out.println("2.Enter the number of Quantity which decreases:");
			qtydc=sc.nextInt();
			i1.issue(qtydc);
			break;
			case 3:	i1.print();
			break;
		}
	}
	while(choice!=4);
}
}