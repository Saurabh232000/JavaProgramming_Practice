package com.programming;

public class check {
public static void main(String[] args) {
	int[]a= {2,4,6,7,9};
	int[]b= {20,40,60,70,90};
	int sum=0;
	int sum1=0;
	for(int i=a.length-1;i>=0;i--)
	{
		sum=sum+a[i];
		System.out.println(a[i]+" ");
	}
	System.out.println(sum);
	int rev=0;
	while(sum!=0)
	{
		int r=sum%10;
		rev=rev*10+r;
		sum=sum/10;
	}
	System.out.println(rev);
	System.out.println("______________");
	for(int i=b.length-1;i>=0;i--)
	{
		sum1=sum1+b[i];
		System.out.println(b[i]+" ");
	}
	System.out.println(sum1);
	int rev1=0;
	while(sum1!=0)
	{
		int r=sum1%10;
		rev1=rev1*10+r;
		sum1=sum1/10;
	}
	System.out.println(rev1);
      int sumF=rev+rev1;
	System.err.println(sumF);
	
}
}
