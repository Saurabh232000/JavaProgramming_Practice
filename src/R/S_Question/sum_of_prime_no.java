package R.S_Question;

import java.util.Scanner;

public class sum_of_prime_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no1:");
	int a=sc.nextInt();
	System.out.println("enter no2");
	int b=sc.nextInt();
	int sum=0;
	for(int i=a;i<=b;i++)
	{
		if(isprime(i))
		{
			System.out.println(i+" is prime");
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
public static boolean isprime(int n)
{ 
	int count=0;
	boolean isprime=false;
	for(int i=2;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==1)
		isprime=true;
		return isprime;
}
}
