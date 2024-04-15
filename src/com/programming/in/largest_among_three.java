package com.programming.in;
import java.util.*;
public class largest_among_three {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter 1st no:");
	int b =sc.nextInt();
	System.out.println("enter 2nd no:");
	int a =sc.nextInt();
	System.out.println("enter 3rd no:");
	int c =sc.nextInt();
	if(a>b&&a>c)
	{
		System.out.println(a+ " is greatest no");
	}
	else if(b>a&&b>c)
	{
		System.out.println(b+ " is greatest no");
	}
	else
	{
		System.out.println(c+ " is greatest");
	}
}
}
