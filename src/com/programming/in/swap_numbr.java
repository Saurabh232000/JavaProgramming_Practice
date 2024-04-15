package com.programming.in;
import java.util.*;
public class swap_numbr {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter 1st no:");
	int a= sc.nextInt();
	System.out.println(" enter 2nd no:");
	int b= sc.nextInt();
//	int temp;
//	temp=a;
//	a=b;
//	b=temp;
	a=((a+b)-(a+b));
	b=((a+b)+(a+b));
	System.err.println(a);
	System.out.println(b);
}
}
