package javaTpoint;

import java.util.Arrays;

public class _39 {
public static void main(String[] args) {
	String s1="listen";
	String s2="sientl";
	if(isAnagram(s1,s2))
			{
		System.out.println("anagram");
			}
	else {
		System.out.println("not anagram");
	}
}
public static boolean isAnagram(String s1,String s2)
{
	if(s1.length()-1!=(s2.length()-1))
	{
		return false;
	}
	else
	{
		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
}
