package Practice_S;

import java.util.Scanner;

public class sort_the_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String s=sc.nextLine();
	char[]c=s.toCharArray();
	char temp;
	int count=0;
	for(int i=0;i<=c.length-1;i++)
	{
		for(int j=i;j<=c.length-1;j++)
		{
			if(c[i]>c[j]&&i!=j)
			{
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}
	}
	for(int i=0;i<=c.length-1;i++)
	{
		System.out.println(c[i]);
		count++;
	}
	System.out.println(count);
}
}
