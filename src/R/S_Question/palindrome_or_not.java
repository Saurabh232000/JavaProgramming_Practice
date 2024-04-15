package R.S_Question;

import java.util.Scanner;

public class palindrome_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int t=n;
	int r=0;
	while(n!=0)
	{
		int re=n%10;
		r=r*10+re;
		n=n/10;
	}
	if(r==t)
	{
		System.out.println("no is palindome");
	}
	else
	{
		System.out.println("no is not palindome");
	}
}
}
