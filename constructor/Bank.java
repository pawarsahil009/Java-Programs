import java.util.*;
class SavingAccount
{
	int accno,bal;
	String accname;
	Scanner sc=new Scanner(System.in);
	
	SavingAccount()
	{
		this.accname="";
		this.accno=0;
		this.bal=0;
	}
	
	SavingAccount(String accname,int accno,int bal)
	{
		this.accname=accname;
		this.accno=accno;
		this.bal=bal;
	}
	
	SavingAccount(String acname,int accno)
	{
		this.accname=accname;
		this.bal=0;
		this.accno=accno;
	}
	
	void depositamt(int amt)
	{	if(amt>0){
			bal+=amt;
			System.out.println("Amount"+amt+"deposit successfully");
		}else{
			System.out.println("Amount should be greater than zero");
		}
		System.out.println("Account Balance:"+bal);
	}
	
	void withdraw(int amt)
	{
		if(amt<=bal)
		{
			bal-=amt;
			System.out.println("withdraw"+amt+"successfull"); 
			System.out.println("Account Balance:"+bal);
		}else{
			System.out.println("Insufficient balance or invalid amount");	
		}
	}
	
	void show()
	{
		System.out.println("Account holder name:"+accname);
		System.out.println("Account number:"+accno);
		System.out.println("Account Balance:"+bal);
	}
}

class Bank
{
	public static void main(String arr[])
	{
	SavingAccount a1=new SavingAccount("Sahil",2003,5000);
	a1.show();
	a1.depositamt(500);
	a1.withdraw(100);
	SavingAccount a2=new SavingAccount("vedant",50000,2023);
	a2.show();
	a2.depositamt(200);
	}
}


