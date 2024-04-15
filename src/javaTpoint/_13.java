package javaTpoint;

import java.util.Scanner;

public class _13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int m=n*n;
	System.out.println(m);
	String a=String.valueOf(n);
	String b=String.valueOf(m);
	if(b.endsWith(a))
	{
		System.out.println("automorphic");
	}
	else
	{
		System.out.println("not automorphic");
	}
}
}
