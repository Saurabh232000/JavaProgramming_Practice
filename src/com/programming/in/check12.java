package com.programming.in;

public class check12 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("");
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			if(i==j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("");
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
}
