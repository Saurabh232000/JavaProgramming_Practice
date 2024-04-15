package com.programming.in;
import java.util.*;
public class check2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your name");
	String g=sc.next();
	char[]name=g.toCharArray();
	
	//char[] name=new char['h'];
   for(int i=0;i<=name.length-1;i++)
   {
	   for(int j=i;j<=name.length-1;j++)
	   {
		   if(name[i]==name[j]&& i!=j)
		   {
			   System.out.println(name[i]);
		   }
	   }
   }
}
}


