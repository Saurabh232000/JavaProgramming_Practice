package Practice_L;

import java.util.Scanner;

public class prime_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int count=0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			count++;
			break;
		}
	}
	if(count==0)
	{
		System.out.println("no is prime");
	}
	else
	{
		System.out.println(" no is not prime");
	}
}
}
