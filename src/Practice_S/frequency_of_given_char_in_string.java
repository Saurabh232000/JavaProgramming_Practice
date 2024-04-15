package Practice_S;

import java.util.Scanner;

public class frequency_of_given_char_in_string {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter string:");
	String s="abbccccddd"; //sc.nextLine();
	int[]a=new int[127];
	for(int i=0;i<=s.length()-1;i++)
	{
		a[s.charAt(i)]=a[s.charAt(i)]+1;
		System.out.println(s.charAt(i)+"="+a[s.charAt(i)]);
	}
	int max=-1;
	char c=' ';
	for(int i=0;i<=s.length()-1;i++)
	{
		if(max<a[s.charAt(i)])
		{
			max=a[s.charAt(i)];
			c=s.charAt(i);
		}
	}
	System.out.println(max+" "+c);
	System.out.println("___________________");
	int min=Integer.MAX_VALUE;
	char ch=' ';
	for(int i=0;i<=s.length()-1;i++)
	{
		if(min>a[s.charAt(i)])
		{
			min=a[s.charAt(i)];
			ch=s.charAt(i);
		}
	}
	System.out.println(min+" "+ch);
//	String s1="abbbbbbccccc";
//	for(int i=0;i<=s1.length()-1;i++)
//	{
//		int count=0;
//		char c=s1.charAt(i);
//		for (int j = 0; j <= s1.length()-1; j++)
//		{
//		char c1=s1.charAt(j);
//		if(c==c1)
//	     	{
//			count++;
//	     	}
//		}
//		System.out.println(s1.charAt(i)+" ="+count);
//	}
//	char max=s1.charAt(0);
//	for(int i=0;i<=s1.length()-1;i++)
//	{
//		if(s1.charAt(i)>max)
//		{
//			max=s1.charAt(i);
//		}
//	}
//	System.err.println("MAX"+"="+max+" ");
//	char min=s1.charAt(0);
//	for(int i=0;i<=s1.length()-1;i++)
//	{
//		if(s1.charAt(i)<min)
//		{
//			min=s1.charAt(i);
//		}
//	}
//	System.err.println("MIN"+" ="+min);
}
}
