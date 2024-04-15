package R.S_Question;

import java.util.Scanner;

public class reverse_the_word {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your String:");
	String s=sc.nextLine();
	String[]word=s.split(" ");
	String rev="";
	for(int i=word.length-1;i>=0;i--)
	{
		rev=rev+word[i]+" ";
	}
	System.out.println(rev+" ");
}
}
