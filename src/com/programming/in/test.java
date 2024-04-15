package com.programming.in;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length");
	int  n=sc.nextInt();
	String[]a=new String[n];
	System.out.println("enter your String");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.next();
	}
	System.out.println("inserted string");
	String inserted=sc.next();
	System.out.println("enter pos");
	int pos=sc.nextInt();
	for(int i=a.length-1;i>pos-1;i--)
	{
		a[i]=a[i+1];
	}
	a[pos]=inserted;
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
}
}
