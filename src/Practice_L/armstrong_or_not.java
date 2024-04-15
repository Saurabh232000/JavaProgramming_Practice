package Practice_L;

import java.util.Scanner;

public class armstrong_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	if(isarms(n))
	{
		System.out.println("no is armstrong");
	}
	else
	{
		System.out.println("no is not armstrong");
	}
}
public static boolean isarms(int n)
{
	int m=n;
	double sum=0;
	while(n!=0)
	{
		int r=n%10;
		sum=sum+Math.pow(r,count(n));
		n=n/10;
	}
	return(sum==n);
}
public static int count(int n)
{
	int count=0;
	int m=n;
	while(m!=0)
	{
		m=m/10;
		count++;
	}
	return count;
}
}
