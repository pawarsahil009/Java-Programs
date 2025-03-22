import java.util.*;
class Furnisher 
{
	int price,quantity,total;
	String product;
	Scanner sc=new Scanner(System.in);

	void input()
	{
		System.out.println("Enter Product Name:");
		product=sc.next();
		System.out.println("Enter Product Quantity:");
		quantity=sc.nextInt();
		System.out.println("Enter Product Price:");
		price=sc.nextInt();
		sum();
	}
	
	void sum()
	{	
		total=price*quantity;
	}
	
	void show()
	{
		System.out.println("Product Name:"+product);
		System.out.println("Product Quantity:"+quantity);
		System.out.println("Product Price:"+price);
		System.out.println("Total Price of Product:"+total);
	}
	
	Furnisher compare(Furnisher prd)
	{
		if(total>prd.total)
		{
			return this;
		}else{
			return prd;
		}
	}
}
class FurnisherProduct
{
	public static void main(String arr[])
	{
		Furnisher f1=new Furnisher();
		f1.input();
		Furnisher f2=new Furnisher();
		f2.input();
		Furnisher f3=new Furnisher();
		f3=f1.compare(f2);
		f3.show();
		f1.sum();
		f2.sum();
	}
}

	











