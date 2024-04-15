package com.programming.in;
import java.util.*;
public class check3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter  no");
	int n=sc.nextInt();
	int[]a=new int[n];
	int sum=0;
	System.out.println(" enter eleemnts");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	int once=a[0];
	for(int i=1;i<=a.length-1;i++)
	{
		once=once^a[i];
	}
	System.out.println(once);
}
}
