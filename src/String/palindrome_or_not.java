package String;
import java.util.*;
public class palindrome_or_not {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter your name");
	String name=sc.next();
	String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	if(rev.equals(name))
	{
		System.out.println(" string is palindrome");
	}
	else
	{
		System.out.println(" string is not palindrome");
	}
}
}
