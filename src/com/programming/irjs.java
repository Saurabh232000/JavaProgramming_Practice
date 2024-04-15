package com.programming;
import java.util.*;
public class irjs {
public static void main(String[] args) {
	String s="abbcccdd rbdfrg ";
//	display(s);
//}
//static void display(String s)
//{
//	char ch[]=s.toCharArray();
//	boolean visit[]=new boolean[ch.length];
//	Arrays.fill(visit, false);
//	for(int i=0;i<ch.length;i++)
//	{
//		if(visit[i]==true)
//			continue;
//		int count=0;
//		for(int j=0;j<ch.length;j++)
//		{
//			if(ch[i]==ch[j])
//			{
//				visit[j]=true;
//				count++;
//			}
//		}
//		System.out.println(ch[i]+" "+count);
//	}
	for(int i=0;i<=s.length()-1;i++) 
	{
		char c=s.charAt(i);
		int count=0;
		for(int j=0;j<=s.length()-1;j++)
		{
			char c1=s.charAt(j);
			if(c==c1)
			{
				count++;
			}
		}
		System.out.println(c+" "+count);
	}
}
}