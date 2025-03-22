class UpdateSaving extends SavingAccount
{
	long aadharno;
	String panno;
	float interest;
	
	void kycinput()
	{
		aadharno=;
		panno="";
	}
		
	void showkyc()
	{
		System.out.println("Aadhar Card Number is:"+aadharno);
		System.out.println("Pan Card Number is:"+panno);
	}
	
	void calinterest()
	{
		interest=balance*0.04;
		balance+=interest;
	}
		
class bank
{
	public static void main(String arr[])
	{
		UpdateSaving s=new UpdateSaving();
		  