package com.programming.in;

import java.util.Scanner;

public class calculator_prac {
public static void main(String[] args) {
	String take;
	do {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a  no:");
		int a=sc.nextInt();
		System.out.println(" enter anotheer another :");
		int b= sc.nextInt();
		System.out.println(" enter choice: + ,- ,*,% ,/ ");
		String choice=sc.next();
		int res;
		switch(choice)
		{
		case"+":res=a+b;
		        System.out.println(res);
		        break;
		case"-":res=a-b;
                System.out.println(res);
                break;
		case"*":res=a*b;
                System.out.println(res);
                break;
		case"%":res=a%b;
                System.out.println(res);
                break;
		case"/":res=a/b;
                System.out.println(res);
                break;
        default:System.out.println("invalid");
		}
		
		System.out.println(" enter y for continue");
		take=sc.next();
	}
	while(take.equals("y")|| take.equals("Y"));
}
}
