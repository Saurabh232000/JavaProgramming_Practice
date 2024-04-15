package com.programming.in;

public class jid {
	int a;
	byte b;
	short c;
	double d;
	float f;
	long l;
	boolean bo;
	char ch;
	jid()
	{
	}
	void mai()
	{
		System.out.println(a);
		System.out.println(this.b);
		System.out.println(this.ch);

		System.out.println(this.c);
		System.out.println(this.d);
		System.out.println(this.f);
		System.out.println(this.l);
		System.out.println(this.bo);
	}
	
public static void main(String[] args) {
	jid j1=new jid();
	
	jid j2=new jid();
     j1.mai();	
	System.out.println(j1);
	System.out.println(j1.hashCode());
	System.out.println(j2);
	
}
}
