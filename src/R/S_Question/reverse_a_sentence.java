package R.S_Question;

import java.util.Scanner;

public class reverse_a_sentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String:");
	String s=sc.nextLine();
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}
