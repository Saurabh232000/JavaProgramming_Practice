package javaTpoint;

import java.util.Scanner;

public class _37 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String:");
	String s=sc.next();
	int count=0;
	for (int i = 0; i <=s.length()-1; i++)
	{
	   count++;	
	}
	System.out.println(count);
}
}
