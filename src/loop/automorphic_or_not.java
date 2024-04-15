package loop;

import java.util.Scanner;

public class automorphic_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int m=n*n;
	String a=String.valueOf(n);
	String b=String.valueOf(m);
	if(b.endsWith(a))
	{
		System.out.println(n+" "+ "is automorphic");
	}
	else
	{
		System.out.println(n+" " +"is not automorphic");
	}
}
}
