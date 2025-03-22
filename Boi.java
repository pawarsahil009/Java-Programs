import java.util.*;
class Boi
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
double amt_dept,amt_paid;
int term,age;
System.out.println("Enter the amount you want to deposite:");
amt_dept=sc.nextDouble();
System.out.println("Enter the terms");
term=sc.nextInt();
System.out.println("Enter the age:");
age=sc.nextInt();
if(term==1)
{
double roig=7.5,rois=8.0;
if(age<60){
System.out.println("General:");
double interestearned=amt_dept*roig*term/100;
System.out.println("Interest earned"+interestearned);
amt_paid=amt_dept+interestearned;
System.out.println("Amount Paid:"+amt_paid);
}else{
System.out.println("Senior citizen:");
double interestearned=amt_dept*rois*term/100;
System.out.println("Interest earned"+interestearned);
amt_paid=amt_dept+interestearned;
System.out.println("Amount Paid:"+amt_paid);
}
}
else if(term<=2)
{
double roig=8.5,rois=9.0;
if(age<60){
System.out.println("General:");
double interestearned=amt_dept*roig*term/100;
System.out.println("Interest earned"+interestearned);
amt_paid=amt_dept+interestearned;
System.out.println("Amount Paid:"+amt_paid);
}else{
System.out.println("Senior citizen:");
double interestearned=amt_dept*rois*term/100;
System.out.println("Interest earned"+interestearned);
amt_paid=amt_dept+interestearned;
System.out.println("Amount Paid:"+amt_paid);
}
}
else if(term<=3)
{
double roig=9.5,rois=10.0;
if(age<60){
System.out.println("General:");
double interestearned=amt_dept*roig*term/100;
System.out.println("Interest earned"+interestearned);
amt_paid=amt_dept+interestearned;
System.out.println("Amount Paid:"+amt_paid);
}else{
System.out.println("Senior citizen:");
double interestearned=amt_dept*rois*term/100;
System.out.println("Interest earned"+interestearned);
amt_paid=amt_dept+interestearned;
System.out.println("Amount Paid:"+amt_paid);
}
}
else
{
double roig=10.0,rois=11.0;
if(age<60){
System.out.println("General:");
double interestearned=amt_dept*roig*term/100;
System.out.println("Interest earned"+interestearned);
amt_paid=amt_dept+interestearned;
System.out.println("Amount Paid:"+amt_paid);
}else{
System.out.println("Senior citizen:");
double interestearned=amt_dept*rois*term/100;
System.out.println("Interest earned"+interestearned);
amt_paid=amt_dept+interestearned;
System.out.println("Amount Paid:"+amt_paid);
}
}
}
}