package com.programming.in;

public class _46 {
public static void main(String[] args) {
	String s="aagbbccdddddc";
	int[]a=new int[127];
	for(int i=0;i<=s.length()-1;i++)
	{
		a[s.charAt(i)]=a[s.charAt(i)]+1;
		System.out.println(s.charAt(i)+" "+a[s.charAt(i)]);
	}
	int max=-1;
	char c=' ';
	for(int i=0;i<=s.length()-1;i++)
	{
		if(a[s.charAt(i)]>max)	
		{
			max=a[s.charAt(i)];
			 c=s.charAt(i);
		}
	}
	System.out.println(max);
	System.out.println(c);
	System.out.println("________formin________");
	int min=Integer.MAX_VALUE;
	char c1=' ';
	for(int i=0;i<=s.length()-1;i++)
	{
		if(a[s.charAt(i)]<min)	
		{
			min=a[s.charAt(i)];
			 c1=s.charAt(i);
		}
	}
	System.out.println(min);
	System.out.println(c1);	
}
}
