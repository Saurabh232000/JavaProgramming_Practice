package com.programming.in;

import java.util.Scanner;

public class jdi {
public static void main(String[] args) {
	for(int i=1;i<=1000;i++)
	{
     if(isArmstrong(i))
     {
    	 System.out.println(i);
     }
     }
}
public static boolean isArmstrong(int n)
{
	int temp=n;
	int sum=0;
	while(n!=0)
	{
		int r=n%10;
		sum=sum+r*r*r;
		n/=10;
	}
	if(sum==temp)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}