package com.programming.in;

import java.util.Scanner;

public class automorphic_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int a=n*n;
	String no=String.valueOf(n);
	String ne=String.valueOf(a);
	if(ne.endsWith(no))
	{
		System.out.println("no is automorphic");
	}
	else
	{
		System.out.println("no is not an automorphic");
	}
}
}
