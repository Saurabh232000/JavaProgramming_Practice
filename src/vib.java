import java.util.Scanner;

import Exam.cod.main;

public class vib {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int n=sc.nextInt(); //153
	int m=n; //1
	double sum=0;
	while(m!=0) 
	{
		int r=m%10; //0
		//sum=sum+r*r*r;//0+27=27,27+125=152,152+0=152
		sum=sum+Math.pow(r,count(n));
		m=m/10;//0.1
	}
	if(sum==n)
	{
		System.out.println(" is armstrong");
	}
	else
	{
		System.out.println("not");
	}
}
public static int count(int n)
{
	int count=0;
	while(n!=0)
	{
		int r=n%10;
		n=n/10;
		count++;
	}
	return count;
}
}
