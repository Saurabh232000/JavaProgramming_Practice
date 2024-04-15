package com.programming.in;

public class ifjiyre {
public static void main(String[] args) {
	String n1="silent";
	char[]cn1=n1.toCharArray();
	char temp;
	for(int i=0;i<=cn1.length-1;i++)
	{
		for(int j=i;j<=cn1.length-1;j++)
		{
			if(cn1[i]>cn1[j])
			{
				temp=cn1[i];
				cn1[i]=cn1[j];
				cn1[j]=temp;
			}
		}
	}
	for(int i=0;i<=cn1.length-1;i++)
	{
		System.out.print(cn1[i]);
	}
}
}
