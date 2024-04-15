package Practice_A;

import java.util.Scanner;

public class insert_an_element {
public static void main(String[] args) {
//	int[]a= {10,20,30,40,50};
//	int add=60;
//	int pos=3;
//	for(int i=a.length-1;i>pos-1;i--)
//	{
//		a[i]=a[i-1];
//	}
//	a[ pos-1]=add;
//	for(int i=0;i<=a.length-1;i++)
//	{
//		System.out.println(a[i]);
//	}
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	int n=sc.nextInt();
	int []a=new int[n];
	System.out.println("enter array elements");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	System.out.println("enter add element:");
	int add=sc.nextInt();
	System.out.println("enter pposition");
	int pos=sc.nextInt();
	for(int i=a.length-1;i>pos-1;i--)
	{
		a[i]=a[i-1];
	}
	a[pos-1]=add;
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
}
}
