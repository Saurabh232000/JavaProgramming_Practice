package Practice_S;

import java.util.Scanner;

public class length_of_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String s=sc.nextLine();
	String g=s.replace("\\n", "");
	System.out.println(g.length());
}
}
