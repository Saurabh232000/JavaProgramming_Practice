package R.S_Question;

import java.util.Scanner;

public class count_each_ch_in_words {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter String:");
	String s="my name is";//String s=sc.nextLine();
	/*int count=0;
	String temp="";
    for(int i=0;i<=s.length()-1;i++)
    {
    	char c=s.charAt(i);
    	if(c!=32)
    	{
    	count++;
    	temp+=c;
    	}
    	else
    	{
    		System.out.println(temp+count);
    		count=0;
    		temp="";
    	}
    }
    System.out.println(temp+count);*/
	String s1[]=s.split(" ");
	for(int i=0;i<s1.length;i++)
	{
		System.out.println(s1[i]+" "+s1[i].length());
	}
}
}