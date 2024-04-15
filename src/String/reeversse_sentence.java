package String;
import java.util.*;
public class reeversse_sentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String sen=sc.next();
	String rev="";
	for(int i=sen.length()-1;i>=0;i--)
	{
		rev=rev+sen.charAt(i);
	}
	System.out.println(rev);
	  ///****** check  palindrome or not 
//	if(rev.equals(sen))
//	{
//		System.out.println(" is palindrome");
//	}
//	else
//	{
//		System.out.println(" is not palindrome");
//	}
}
}
