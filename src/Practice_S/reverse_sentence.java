package Practice_S;

import java.util.Scanner;

public class reverse_sentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter sentence");
	String s=sc.nextLine();
	String rev="";
   int	count=0; // for length of given string
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
		count++;
	}
	System.out.println(rev);
	System.out.println(count);
}
}
