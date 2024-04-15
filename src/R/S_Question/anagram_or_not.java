package R.S_Question;

import java.util.Arrays;
import java.util.Scanner;

public class anagram_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name1");
	String name1=sc.next();
	System.out.println("enter name2");
	String name2=sc.next();
	if(isAnagram(name1,name2))
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not anagram");
	}
}
public static boolean isAnagram(String name1,String name2)
{
	if(name1.length()-1!=name2.length()-1)
	{
		return false;
	}
	char[]a=name1.toCharArray();
	   Arrays.sort(a);
	   char[]b=name2.toCharArray();
	   Arrays.sort(b);
	   if(Arrays.equals(a, b))
	   {
		   return true;
	   }
	   return false;
	}
}
