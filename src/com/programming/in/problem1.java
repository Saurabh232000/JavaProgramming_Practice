package com.programming.in;

import java.util.Scanner;

public class problem1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter no:");
String name=sc.next();
char[]c=name.toCharArray();
System.out.println("enter searching element");
char s=sc.next().charAt(0);
int index;
for(int i=0;i<=c.length-1;i++)
{
	if(c[i]==s)
{
	index=i;
	System.out.println(index);
}
}

}
}
