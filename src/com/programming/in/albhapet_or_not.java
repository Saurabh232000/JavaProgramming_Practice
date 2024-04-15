package com.programming.in;
import java.util.*;
public class albhapet_or_not {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a  char:");
	char c= sc.next().charAt(0);
	if(c>='a' && c<='z' || c>='A'&&c<='Z')
	{
		System.out.println(c+" is albhapet ");
	}
	else
	{
		System.out.println(c+" is not albhapeet");
	}
}
}
