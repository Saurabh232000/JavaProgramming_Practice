package com.programming.in;

public class check10 {
public static void main(String[] args) 
{ 
	int a=100;
	int b=0;
	int c=a/b;
	System.out.println(c); // runtime exception
	try {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println(c);// compile time exception
        }
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}