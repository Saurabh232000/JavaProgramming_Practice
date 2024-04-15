package Practice_B;

import java.util.Scanner;

public class ascii_of_a_char {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter char:");
	char c=sc.next().charAt(0);
	int ascii=c;
	System.out.println(ascii);
}
}
