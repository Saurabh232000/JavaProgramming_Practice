package com.programming.in;

import java.util.Scanner;

public class check1 {
public static void main(String[] args) {
	// 1. positive or negative number
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	if(n>0)
//	{
//		System.out.println(" no is positive");
//	}
//	else
//	{
//		System.out.println(" no is negative");
//	}
	// 2. even or odd
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	if(n%2==0)
//	{
//		System.out.println(" no is even ");
//	}
//	else
//	{
//		System.out.println(" no is odd");
//	}
	// 3.sum of first n natural no
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	int sum=0;
//	for(int i=0;i<=n;i++)
//	{
//		sum=sum+i;
//	}
//	System.out.println(sum);
	// 4. sum of a number in a given range
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no1");
//	int a=sc.nextInt();
//	System.out.println("enter no2");
//	int b=sc.nextInt();
//	int sum=0;
//	for(int i=a;i<=b;i++)
//	{
//		sum=sum+i;
//	}
//	System.out.println(sum);
//	// 5. greatest of two no:
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no1");
//	int a=sc.nextInt();
//	System.out.println("enter no2");
//	int b=sc.nextInt();
//	if(a>b)
//	{
//		System.out.println(a+" is greatest");
//	}
//	else
//	{
//		System.out.println(b+" iis greatest");
//	}
	// 6. greatest of three no:
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no1");
//		int a=sc.nextInt();
//		System.out.println("enter no2");
//		int b=sc.nextInt();
//		System.out.println("enter no3");
//		int c=sc.nextInt();
//		if(a>b&&a>c)
//		{
//			System.out.println(a+" is greatest");
//		}
//		else if(b>a&&b>c)
//		{
//			System.out.println(b+" iis greatest");
//		}
//		else
//		{
//			System.out.println(c+" is greatest");
//		}
	// 7. leap year or not
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter a no:");
//	int n=sc.nextInt();
//	if(n%4==0&&n%400==0)
//	{
//		System.out.println(n+" is leap year");
//	}
//	else
//	{
//		System.out.println(n+" is not leap year");
//	}
	// 8. prime or not
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter a no:");
//	int n=sc.nextInt();
//	int count=0;
//	for(int i=1;i<n;i++)
//	{
//		if(n%i==0)
//		{
//			count++;
//		}
//	}
//	if(count>1)
//	{
//		System.out.println(n+" is not prime");
//	}
//	else
//	{
//		System.out.println(n+" is prime");
//	}
	//9.prime number  between range
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no1");
//	int a=sc.nextInt();
//	System.out.println("enter no2");
//	int b=sc.nextInt();
//	for(int i=a;i<b;i++)
//	{
//		int count=0;
//		for(int j=2;j<=i;j++)
//		{
//			if(i%j==0)
//			{
//				count++;
//			}
//		}
//		if(count==1)
//		{
//			System.out.println(i);
//		}
//	}
	// 10.sum of a digit of a number
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	int sum=0;
//	while(n!=0)
//	{
//		int r=n%10;
//		sum=sum+r;
//		n=n/10;
//	}
//	System.out.println(sum);
	// 11. REVERSE A NUMBER
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter a no:");
//	int n=sc.nextInt();
//	int rev=0;
//	while(n!=0)
//	{
//		int r=n%10;
//		rev=rev*10+r;
//		n=n/10;
//	}
//	System.out.println(rev);
	// 12.PLINDROME NUMBER
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter a no:");
//	int n=sc.nextInt();
//	int m=n;
//	int rev=0;
//	while(n!=0)
//	{
//		int r=n%10;
//		rev=rev*10+r;
//		n=n/10;
//	}
//	if(rev==m)
//	{
//		System.out.println(m+" is palindrome");
//	}
//	else
//	{
//		System.out.println(m+" is not palindrome");
//	}
	// 13.FIBBONACI SERIES
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	int a=0;
//	int b=1;
//	int temp;
//	for(int i=1;i<=n;i++)
//	{
//		temp=a+b;
//		a=b;
//		b=temp;
//		System.out.println(temp);
//	}
	// 14.TRIONCCI SERIES
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no:");
//		int n=sc.nextInt();
//		int a=0;
//		int b=1;
//		int c=1;
//		int temp;
//		for(int i=1;i<=n;i++)
//		{
//			temp=a+b+c;
//		b=c;
//		c=a;
//		a=temp;
//			System.out.println(temp);
//		}
	// 15. FACTORIAL OF A NUMBER
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	int fact=1;
//	for(int i=1;i<=n;i++)
//	{
//		fact=fact*i;
//	}
//	System.out.println(fact);
	// 16.POWER OF A NUMBER
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter base");
//	int b=sc.nextInt();//2
//	System.out.println("enter power");
//	int p=sc.nextInt();//3
//	int power=1;
//	for(int i=1;i<=p;i++)
//	{
//	power=power*b;	
//	}
//	System.out.println(power);
	//17.FACTOR OF A NUMBER
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter a no:");
//	int n=sc.nextInt();
//	for(int i=1;i<=n;i++)
//	{
//		if(n%i==0)
//		{
//			System.out.println(i);
//		}
//	}
	//18.STRONG NUMBER
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	int m=n;
//	int sum=0;
//	while(n!=0)
//	{
//		int r=n%10;
//		sum=sum+fact(r);
//		n=n/10;
//	}
//	if(sum==m)
//	{
//		System.out.println(m+" is strong ");
//	}
//	else
//	{
//		System.out.println(m+" is not strong");
//	}
//}
//public static int fact(int n)
//{
//	int fact=1;
//	for(int i=1;i<=n;i++)
//	{
//		fact=fact*i;
//	}
//	return fact;
	// 19.PERFECT NUMBER
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter a no:");
//	int n=sc.nextInt();
//	int temp=n;
//	int sum=0;
//	for(int i=1;i<n;i++)
//	{
//		if(n%i==0)
//		{
//			System.out.println(i);
//			sum=sum+i;
//		}
//	}
//	if(temp==sum)
//	{
//		System.out.println(temp+ " is perfect");
//	}
//	else
//		System.out.println(temp+ " is not perfect");
	// 20.AUTOMORPHIC NUMBER
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	int m=n*n;
//	String a=String.valueOf(n);
//	String b=String.valueOf(m);
//	if(b.endsWith(a))
//	{
//		System.out.println(n+" "+ "is automorphic");
//	}
//	else
//	{
//		System.out.println(n+" " +"is not automorphic");
//	}
	//21. count
//  Scanner sc=new Scanner(System.in);
//  System.out.println("enter a no:");
//  int n=sc.nextInt();
//  int count=0;
//  while(n!=0)
//  {
//	  int r=n%10;
//	  n=n/10;
//	  count++;
//  }
//  System.out.println(count);
}
}
