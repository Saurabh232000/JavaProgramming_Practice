package Practice_S;

import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String name=sc.next();
	//char c=name.toCharArray();
	String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
}
}
