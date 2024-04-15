package Practice_B;

import java.util.Scanner;

public class quo_rem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter dividend");
	int divi=sc.nextInt();
	System.out.println("enter divisor");
	int div=sc.nextInt();
	int rem=divi%div;
	System.out.println(rem);
	int quo=divi/div;
	System.out.println(quo);
}
}
