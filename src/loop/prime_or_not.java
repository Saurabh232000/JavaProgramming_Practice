package loop;
import java.util.*;
public class prime_or_not {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter no:");
	int n= sc.nextInt();
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
//		if(isprime(n))
//		{
//			System.out.println(" no is prime");
//		}
//		else
//		{
//			System.out.println(" no is not prime");
//		}
//	}
//
//	static boolean isprime(int n)
//	{
//		for(int i=2;i<n;i++)
//		{
//			if(n%i==0)
//			{
//				return false;
//			}
//		}
//		return true;
//	}
