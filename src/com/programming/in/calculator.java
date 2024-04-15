package com.programming.in;
import java.util.*;
public class calculator {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter no1:");
	int a=sc.nextInt();
	System.out.println("enter another no:");
	int b= sc.nextInt();
	System.out.println("select operator:+ ,- ,* ,/ ,%");
	String choice=sc.next();
	int result;
	switch(choice)
	{
	case "+":result=a+b;
	        System.out.println(result);
	        break;
	case"-":result=a-b;
            System.out.println(result);
            break;
	case"*":result=a*b;
           System.out.println(result);
           break;
	case"/":result=a/b;
           System.out.println(result);
           break;
	case"%":result=a%b;
           System.out.println(result);
           break;
     default:System.out.println("invalid");
	}
}
}
