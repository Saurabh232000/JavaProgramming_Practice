package Practice_S;

import java.util.Scanner;

public class replace_particular_word_another {
public static void main(String[] args) {
//	String s=" my name is sourav Abhishek";
//	String h=s.replace("sourav","saurabh");
//	System.out.println(h);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String s=sc.nextLine();
	String n=s.replace("sourav", "SAURABH");
	System.out.println(n);
	
}
}
