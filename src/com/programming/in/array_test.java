package com.programming.in;
import java.util.*;
public class array_test {
public static void main(String[] args) {
	//int []a= {37,6,8,9,56,4,7,37,9,7};
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter the no0");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter array element");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		//System.out.println(a[i]);
	}
	int index;
	for(int i=0;i<a.length-1;i++)
	{
		
			if(a[i]==6)
			{
				index=i;
			//	System.out.println(a[i]);
				System.out.println(index);
			}
		}
	}
}

