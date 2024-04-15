package com.programming.in;

import java.util.Scanner;

public class sum_of_digit_of_a_number {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a nuber");
	int n=sc.nextInt();
	int sum=0;
	while(n!=0)
	{
		int r=n%10;
		sum=sum+r;
		n=n/10;
	}
	System.out.println(sum);
}
}
