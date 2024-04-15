package Practice_S;

import java.util.Scanner;

public class sort_name {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length");
	int n=sc.nextInt();
	System.out.println("enter string");
	String[]s=new String[n];
	for(int k=0;k<=s.length-1;k++)
	{
		s[k]=sc.next();
	}
	String temp;
	for(int i=0;i<=s.length-1;i++)
	{
		for(int j=i;j<=s.length-1;j++)
		{
			if(s[i].compareTo(s[j])>0)
			{
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
	for(int i=0;i<=s.length-1;i++)
	{
		System.out.println(s[i]);
	}
}
}
