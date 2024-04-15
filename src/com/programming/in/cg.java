package com.programming.in;

public class cg {
public static void main(String[] args) {
	String s="this is a mango but not sweet";
	String[]word=s.split(" ");
	String s2="";
	for(int i=0; i <=word.length-1; i++) 
	{
		for(int j=0;j<=word[i].length()-1;j++)
		{
			if(j==0 ||j==word[i].length()-1)
			{
				s2=s2+String.valueOf(word[i].charAt(j)).toUpperCase();
			}
			else
			{
				s2=s2+String.valueOf(word[i].charAt(j));
			}
		}
		s2=s2+" ";
	}
	System.out.println(s2);
}
}
