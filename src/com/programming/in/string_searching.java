package com.programming.in;

import java.util.Scanner;

public class string_searching {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int put=sc.nextInt();
	String[]name=new String[put];
	System.out.println(" enter value");
	for(int i=0;i<=name.length-1;i++)
	{
		name[i]=sc.next();
	}
	String temp;
	for(int i=0;i<=name.length-1;i++)
	{
		for(int j=i;j<=name.length-1;j++)
		{
			if(name[i].compareTo(name[j])<0)
			{
				temp=name[i];
				name[i]=name[j];
				name[j]=temp;
			}
		}
	}
	for(int i=0;i<=name.length-1;i++)
	{
		System.out.println(name[i]);
	}
}
}
