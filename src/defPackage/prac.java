package defPackage;

import java.util.Scanner;

public class prac {
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("enter no");
int n= sc.nextInt();
int []a=new int[n];
System.out.println("enter elements:");
for(int k=0;k<=a.length-1;k++)
{
	a[k]=sc.nextInt();
}
System.out.println("enter deleted element");
int del=sc.nextInt();
int []ne=new int [a.length-1];
int d=0;
for(int i=0;i<=a.length-1;i++)
{
	if(del==a[i])
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
