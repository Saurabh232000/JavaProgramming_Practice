package Exam.cod;

import java.util.Scanner;

public class lkjhgf {
public static void main(String[] args) {
//	int[]a= {10,20,30,40,50};
//	int[]n=new int[a.length];
//	for(int i=0;i<=a.length-1;i++)
//	{
//		n[i]=a[i];
//	}
//  for(int i=0;i<=n.length-1;i++)
//  {
//	  System.out.println(n[i]);
//  }
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	int n=sc.nextInt();
	System.out.println("enter last no:");
	int m=sc.nextInt();
	for(int i=n;i<=m;i++)
	{
		if(isArmstrong(i))
		{
			System.out.println(i+" "+"armstrong");
		}
	}
}
 public static boolean isArmstrong(int n)
 {
	 int m=n;
	 double sum=0;
	 int count = count(n);
	 while(n!=0)
	 {
		 int r=n%10;
		 sum=sum+Math.pow(r, count);
		 n=n/10;
	 }
	 if(sum==m)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
 }
 public static int count(int n)
 {
	 int count=0;
	 while(n!=0)
	 {
		 int r=n%10;
		 count++;
		 n=n/10;
	 }
	 return count;
 }
}
