package R.S_Question;

import java.util.Scanner;

public class display_prime_between_1_to_n {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no1:");
	int a=sc.nextInt();
	System.out.println("enter no2");
	int b=sc.nextInt();
//	for(int i=a;i<=b;i++)
//	{
//		if(isprime(i))
//		{
//			System.out.println(i+" is prime");
//		}
//	}
//}
//public static boolean isprime(int n)
//{ 
//	int count=0;
//	boolean isprime=false;
//	for(int i=2;i<=n;i++)
//	{
//		if(n%i==0)
//		{
//			count++;
//		}
//	}
//	if(count==1)
//		isprime=true;
//		return isprime;
	//#2.SECOND METHOD 
	for(int i=a;i<=b;i++)
	{
		int count=0;
		for(int j=2;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(i+"="+"is prime");
		}
	}
}
}
