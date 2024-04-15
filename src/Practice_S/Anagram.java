package Practice_S;

// A WORD OR NAME REARRANGING OF ANOTHER WORD
import java.util.Scanner;
import java.util.*;
public class Anagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name1="silent"; 
	String name2="listen";   
	if(isAnagram(name1,name2))
	{
		System.out.println("anagram");
	}
	else
	{
		System.out.println("not anagram");
	}
}
public static boolean isAnagram(String name1,String name2)
{
	if(name1.length()-1!=name2.length()-1)
	{
		return false;
	}
	char[]a=name1.toCharArray();
	char[]b=name2.toCharArray();
	Arrays.sort(a) ;
    Arrays.sort(b);
    if(Arrays.equals(a, b))
    	
    	return true;
    else
    	return false;
}
}