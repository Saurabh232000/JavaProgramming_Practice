package Practice_L;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int m=n;
	int rev=0;
	while(n!=0)
	{
	int r=n%10;
	rev=rev*10+r;
	n=n/10;
	}
	if(m==rev)
	{
		System.out.println("no is palindrome");
	}
	else
	{
		System.out.println("no is not palindrome");
	}
}
}
