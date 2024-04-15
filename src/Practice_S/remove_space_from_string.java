package Practice_S;

import java.util.Scanner;

public class remove_space_from_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String s=sc.nextLine();
//	String t=s.trim();
//	System.out.println(t);
	String r=s.replace(" ", "");
	System.out.println(r);
}
}
