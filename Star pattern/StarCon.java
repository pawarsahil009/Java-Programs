import java.util.*;
class Star
{
	Star(int rows,int cols)
	{
		System.out.println(rows,cols);
		
	}
	void printdiag()
	{
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class StarCon
{
	public static void main(String arr[])
	{
		Star s1=new Star(4,4);
		s1.printdiag();
	}
}