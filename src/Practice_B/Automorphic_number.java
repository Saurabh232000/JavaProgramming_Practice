package Practice_B;

import java.util.Scanner;

public class Automorphic_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int n=sc.nextInt();
	int a=n*n;
	String m=String.valueOf(n);
	String l=String.valueOf(a);
	if(l.endsWith(m))
	{
		System.out.println("no is automorphic");
	}
	else
	{
		System.out.println("no is not automorphic");
	}
}
}
