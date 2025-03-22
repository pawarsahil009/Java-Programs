import java.util.*;
class CricketPlayer
{
	String name,country;
	int matchscores[]=new int[5];
	Scanner sc=new Scanner(System.in);

	CricketPlayer()
	{
	}

	CricketPlayer(String name,String country,int matchscores[])
	{
		this.name=name;
		this.country=country;
		this.matchscores=matchscores;
	}
	
	void read()
	{
		System.out.println("Enter the player name:");
		name=sc.next();
		System.out.println("Enter the country name:");
		country=sc.next();
		System.out.println("Enter last 5 matchs score:");
		for(int i=0;i<5;i++)
		{
			 matchscores[i]=sc.nextInt();
		}
	}
	
	int average()
	{
		int sum=0;
		for(int i=0;i<5;i++)
 		{
			sum+=matchscores[i];
		}
		return sum;
	}

	void display()
	{
		System.out.println("Name:"+name+"\nCountry:"+country+"\nAverage Score:"+average());
	}
}
class Cricket
{
	public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		CricketPlayer cp[]=new CricketPlayer[5];
		for(int i=0;i<5;i++)
		{
			cp[i]=new CricketPlayer();
			cp[i].read();
		}
		System.out.println("Cricket Player Data:");
		for(int i=0;i<5;i++)
		{
			cp[i].display();
		}
	}
}






		