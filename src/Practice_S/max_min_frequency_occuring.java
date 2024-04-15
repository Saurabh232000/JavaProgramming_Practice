package Practice_S;

import java.util.Scanner;

public class max_min_frequency_occuring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enteer string:");
	String s=sc.nextLine();
	int[]a=new int[127];
	for(int i=0;i<=s.length()-1;i++)
	{
		a[s.charAt(i)]=a[s.charAt(i)]+1;
	}
	int max=0;
	char c=' ';
	for(int i=0;i<=s.length()-1;i++)
	{
		if(max<a[s.charAt(i)])
		{
			max=a[s.charAt(i)];
			c=s.charAt(i);
		}
	}
	System.out.println(c+" "+max);
	int min=0;
	char d=' ';
	for(int i=0;i<=s.length()-1;i++)
	{
		if(min>a[s.charAt(i)])
		{
			min=a[s.charAt(i)];
			d=s.charAt(i);
		}
	}
	System.out.println(d+" "+min);
}
}
