package R.S_Question;

public class palindrome_or_not_string {
public static void main(String[] args) {
	String name="mam";
	String name1=name;
	String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	if(rev.equals(name1))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
}
}
