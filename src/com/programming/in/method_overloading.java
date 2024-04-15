package com.programming.in;

public class method_overloading {
	void sum()
	{
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}
	int sum(int a,int b)
	{
		return a+b;
	}
public static void main(String[] args) {
	method_overloading o1=new method_overloading();
	int x=50;
	int y=60;
	o1.sum();
	int n=o1.sum(x,y);
	System.out.println(n);
}
}
