package com.programming.in;

import java.util.Scanner;

public class jfb {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter no");
	int a=sc.nextInt();//10
	System.out.println(" enter anothere no:");
	 int b=sc.nextInt();//20
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 System.out.println(a);
	 System.out.println(b);
}
}
