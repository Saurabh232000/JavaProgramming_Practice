package Practice_S;

import java.util.Scanner;

public class ascii_of_givn_char {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enteer char:");
	char c=sc.next().charAt(0);
	int ascii=c;
	System.out.println(ascii);
}
}
