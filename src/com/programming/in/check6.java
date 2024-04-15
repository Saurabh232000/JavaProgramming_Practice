package com.programming.in;

import java.util.Scanner;

public class check6 {
public static void main(String[] args) {
	Scanner ssc=new Scanner(System.in);
    System.out.println("enter no:");
    int n=ssc.nextInt();
    int[]a=new int[n];
    System.out.println("enter elements:");
    for(int k=0;k<=a.length-1;k++)
    {
    	a[k]=ssc.nextInt();
    }
    int[]ne=new int[a.length-1];
    int d=0;
  System.out.println("enter delete element:");
  int del=ssc.nextInt();
  for(int i=0;i<=a.length-1;i++)
  {
	  if(a[i]==del)
	  {
		  continue;
	  }
	  else
	  {
	  ne[d++]=a[i];
     }
}
  for(int i=0;i<=ne.length-1;i++)
  {
  System.out.println(ne[i]);
}
}
}