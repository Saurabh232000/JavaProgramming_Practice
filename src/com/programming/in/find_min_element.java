package com.programming.in;
import java.util.*;
public class find_min_element {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println(" enter no:");
	int n= sc.nextInt();
	int temp;
	int a[]=new int[n];
	System.out.println(" enter array element");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int j=0;j<=a.length-1;j++)
	{
		for(int k=j;k<a.length-1;k++)
		{
			if(a[j]>a[k])
{
  temp=a[j];
  a[j]=a[k];
  a[k]=temp;
}
		}
		System.out.print(a[j]+" ");
	}
	System.err.println(" the minimum element " +a[0]);
}
}
