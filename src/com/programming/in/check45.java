package com.programming.in;

public class check45 {
public static void main(String[] args) {
	String s="jitu is a good boy";
	int count=0;
	String s1="";
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)!=32)
		{
			count++;
			s1=s1+s.charAt(i);
		}
		else
		{
			System.out.println(s1+" "+count);
			count=0;
			s1="";
		}
	}
	System.out.println(s1+" "+count);
}
}
