package com.programming.in;

import java.util.Scanner;

public class check13 {
public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
//  int n=sc.nextInt();
//	int[]a=new int[n];
//	System.out.println("enter array elements:");
//	for(int k=0;k<=a.length-1;k++)
//	{
//		a[k]=sc.nextInt();
//	}
	// REMOVE DUPLICATE OR NON REPEATED ELEMENT
	//int[]a= {1,2,3};
//    for(int i=0;i<=a.length-1;i++)
//    {
//    	for(int j=i;j<=a.length-1;j++)
//    	{
//    	if(a[i]==a[j]&&i!=j)
//    	{
//    		a[i]=-1;
//    		a[j]=-1;
//    	}
//    	}
//    }
//    for(int i=0;i<=a.length-1;i++)
//    {
//    	if(a[i]!=-1)
//    	{
//    		System.out.println(a[i]);
//    	}
//    }
  // DELETE A ELEMENT
	int []a= {2,4,6,8,10,12};
	int d=0;
	int[]b=new int[a.length-1];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter dele element");
	int del_elem=sc.nextInt();
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]==del_elem)
		{
			continue;
		}
		b[d++]=a[i];
	}
	for(int i=0;i<=b.length-1;i++)
	{
		System.out.println(b[i]);
	}
}
}