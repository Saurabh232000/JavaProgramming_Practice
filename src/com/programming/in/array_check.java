package com.programming.in;

public class array_check {
public static void main(String[] args) {
	int[]a= {1,5,2,7,4,6,3,10,8,9};
	int temp;
	for(int i=0;i<a.length/2;i++)
	{
		for(int j=i;j<a.length/2;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.err.println("in  ascending orerr");
	for(int i=0;i<a.length/2;i++)
	{
		System.out.println(a[i]);
	}
	for(int i=a.length/2;i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.err.println("in decending order");
	for(int i=a.length/2;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
}
}
