package javaTpoint;

public class _42 {
public static void main(String[] args) {
	String s="saurav";
	System.out.println(s.replace("v", "bh"));
	System.err.println("________________________________");
	String s1="mam";
	String s2=s1;
	String rev="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		rev=rev+s1.charAt(i);
	}
	if(rev.equals(s2))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
