package com.programming.in;

public class orfv {
public static void main(String[] args) {
	int[]a= {60,74,564,342};
	int temp;
	for(int i=0;i<a.length/2;i++)
	{
		for (int j = i+1; j <a.length/2; j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print(a[i]);
	}
	int temp1;
	for(int i=a.length/2;i<a.length;i++)
	{
		for (int j = i+1; j <a.length; j++)
		{
			if(a[i]<a[j])
			{
				temp1=a[i];
				a[i]=a[j];
				a[j]=temp1;
			}
		}
		System.out.print(a[i]);
	}
}
}
