package com.programming.in;

public class Test1 {

	public static void main(String[] args) 
	{
       try {
		Class.forName("com.programming.in.Gopi");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
