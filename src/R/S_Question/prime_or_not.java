package R.S_Question;

import java.util.Scanner;

public class prime_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	int a=sc.nextInt();
	int count=0;
	for(int i=2;i<=a;i++)
	{
		if(a%i==0)
		{
			count++;
		}
	}
	if(count==1)
	{
		System.out.println(a+" is prime");
	}
	else
	{
		System.out.println(a+"is not prime");
	}
}
}
