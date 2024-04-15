package Practice_S;

import java.util.Scanner;

public class find_non_repetitve_char {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.next();
	char[]c=s.toCharArray();
	for(int i=0;i<=c.length-1;i++)
	{
		for(int j=i+1;j<=c.length-1;j++)
		{
			if(c[i]==c[j])
			{
				c[i]=' ';
				c[j]=' ';
			}
		}
	}
	for(int i=0;i<=c.length-1;i++)
	{
		if(c[i]!=' ')
		{
			System.out.println(c[i]);
		}
	}
}
}
