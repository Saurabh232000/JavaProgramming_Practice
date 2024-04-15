package com.programming.in;

public class check11 {
public static void main(String[] args) {
	String name="aabbcccbc";
	int []a=new int[127];
	for(int i=0;i<=name.length()-1;i++)
	{
		a[name.charAt(i)]=a[name.charAt(i)]+1;
	}
//	int max=-1;
//	char c=' ';
	int min=Integer.MAX_VALUE;
	char d=' ';
	for(int i=0;i<=name.length()-1;i++)
	{
//		if(max<a[name.charAt(i)])
//		{
//			max=a[name.charAt(i)];
//			c=name.charAt(i);
//		}
		if(min>a[name.charAt(i)])
		{
			min=a[name.charAt(i)];
			d=name.charAt(i);
		}
	}
//	System.out.println(max+" "+c);
	System.out.println(min+" "+d);
}
}
