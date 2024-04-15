package com.programming.in;
import java.util.*;
public class calculator_using_do_while {
public static void main(String[] args) {
	String user;
		do
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1 no:");
		int a=sc.nextInt();
		System.out.println(" enter another no:");
		int b=sc.nextInt();
		System.out.println(" enter choice : + ,- ,* ,% ,/ ");
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
		         case"/":res=a/b;
		           System.out.println(res);
		           break;
		         case"%":res=a%b;
		           System.out.println(res);
		           break;
		           default:System.out.println("invalid");
		 } 
   		System.out.println(" press y for continue");
   		 user=sc.next();
	}
	while(user.equals("y") || user.equals("Y"));
}	
}

