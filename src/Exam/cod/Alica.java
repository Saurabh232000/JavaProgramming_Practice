package Exam.cod;

import java.util.Scanner;

public class Alica {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int n=sc.nextInt();
	if(isArms(n))
	{
		System.out.println(n+"is Armstrong");
	}
	else
	{
		System.out.println(n+"is not armstrong");
	}
}
public static boolean isArms(int n)
{ 
	int m=n;
	int sum=0;
	while(n!=0)
	{
		int r=n%10;
		sum=sum+r*r*r;
		n/=10;
	}
	if(sum==m)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
