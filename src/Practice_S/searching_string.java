package Practice_S;

import java.util.Scanner;

public class searching_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length");
	int n=sc.nextInt();
	System.out.println("enter name");
	String[]s=new String[n];
	for(int k=0;k<=s.length-1;k++)
	{
		s[k]=sc.next();
	}
	System.out.println("enter searching String");
	String search=sc.next();
	for(int i=0;i<=s.length-1;i++)
	{
		if(s[i].equals(search))
		{
			System.out.println(s[i]+" "+i);
		}
	}
}
}
