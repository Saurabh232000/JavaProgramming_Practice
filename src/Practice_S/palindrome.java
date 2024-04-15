package Practice_S;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String name=sc.next();
	String z=name;
	String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	if(z.equals(rev))
	{
		System.out.println("String is palindrome");
	}
	else
	{
		System.out.println("string is not palindrome");
	}
}
}
