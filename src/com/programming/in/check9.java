package com.programming.in;

import java.util.Scanner;

public class check9 {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no of array");
//	int n=sc.nextInt();
//	int[]a=new int[n];
//	System.out.println("enter element:");
//	for(int k=0;k<=a.length-1;k++)
//	{
//		a[k]=sc.nextInt();
//	}
	int[]a= {10,20,30,40,50,20,30,40};
   for(int i=0;i<=a.length-1;i++)
   {
	   for(int j=i;j<=a.length-1;j++)
	   {
		   if(a[i]==a[j]&&i!=j)
		   {
			   System.out.println(a[i]);
			   a[i]=-1;
			   a[j]=-1;
		   }
	   }
   }
   for(int i=0;i<=a.length-1;i++)
   {
	   if(a[i]!=-1)
	   {
		   System.out.println(a[i]);
	   }
   }
}
}
