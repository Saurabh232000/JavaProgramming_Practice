package com.programming.in;
import java.util.*;
public class odd_even {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println(" enter a no:");
	int n= sc.nextInt();
	if(n%2==0)
	{
		System.out.println(" no  is even");
	}
	else
	{
		System.out.println("no is odd");
	}
}
}