package com.programming.in;

public class m_method_overload {
	public static void main(String[]args)
	{
		 m_method_overload m1=new  m_method_overload();	
		 System.out.println("Saurabh");
		 m1.main(23);
		 m1.main ("sept",2000);
		 
	}
	public static void main(int n )
	{
		System.out.println(" Abhishek");
		System.out.println(n);
	}
	public static void main(String n,int m)
	{
		System.out.println(n+ " "+ m);
	}
}
