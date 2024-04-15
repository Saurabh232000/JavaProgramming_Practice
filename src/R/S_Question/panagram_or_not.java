package R.S_Question;

import java.util.Arrays;
import java.util.Scanner;

public class panagram_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter sentence");
	String s="abCde fG hij kLmnop  q rStuvwxyz";
	String s1=s.toLowerCase();
	s1.replace("\\n", " ");
	System.out.println(s1);
	if(isPanagram(s1))
	{
		System.out.println("panagram");
	}
	else
	{
		System.out.println("not panagram");
	}
}
public static boolean isPanagram(String s)
{
	if(s.length()<26) {
		return false;
	}
	else
	{
		char[]a=s.toCharArray();
		for(char c='a';c<='z';c++)
		{
			if(s.indexOf(c)<0)
			{
				return false;
			}
		}
			return true;
	}
}
}