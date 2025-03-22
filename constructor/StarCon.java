import java.util.*;
class Star
{	
	int rows,cols;
	Star()
	{
		this.rows=4;
		this.cols=4;
	}
	
	Star(int rows,int cols)
	{
		this.rows=rows;
		this.cols=cols;
	}
	
	void printDiag(int rows,int cols)
	{
		for(int i=0;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void printDiaga(int cols,int rows)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				if(i==1 || i==rows || j==1 || j==cols)
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
class StarCon
{
	public static void main(String arr[])
	{	
		Star s1=new Star();
		s1.printDiag(5,5);
		Star s2=new Star();
		s2.printDiaga(9,5);
	}
}