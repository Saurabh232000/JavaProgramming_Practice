package com.programming.in;

import java.util.Scanner;

public class check4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println(" enter elements:");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			System.out.print(a[j]+" ");
		}
		for(int k=0;k<i;k++)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println(" ");
	}
}
}
