package com.programming.in;

import java.util.Scanner;

public class check5 {
public static void main(String[] args) {
	try {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
   System.out.println("enter no");
   int m=sc.nextInt();
   for(int i=n;i<=m;i++)
   {
	   int sum=0;
	   int temp=i;
	   while(temp!=0)
	   {
		   int r=temp%10;
		   sum=sum+r*r*r*r;
		   temp=temp/10;
	   }
	   if(sum==i)
	   {
		   System.out.println(i+" "+" no is armstrong");
	   }
//	   else
//	   { 
//		   System.out.println(i+" "+ " no is not armstrong ");
//	   }
   }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
