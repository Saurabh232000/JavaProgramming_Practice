package javaTpoint;

import java.util.Scanner;

public class _46 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length :");
	int n=sc.nextInt();
	String[]s=new String[n];
	System.out.println("enter elements:");
	for(int k=0;k<=s.length-1;k++)
	{
		s[k]=sc.next();
	}
	for (int i = 0; i < s.length; i++) 
	{
		for (int j = i+1; j < s.length; j++)  
		{
			if(s[i].equals(s[j]))
			{
				System.out.println(s[i]);
			}
		}
	}
}
}
