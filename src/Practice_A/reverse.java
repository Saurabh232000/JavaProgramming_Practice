package Practice_A;

import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int[]a=new int[n];
	System.out.println("enter elements:");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
}
}