package Practice_B;

import java.util.Scanner;

public class swap_two_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no1:");
	int a=sc.nextInt();
	System.out.println("enter no2:");
	int b=sc.nextInt();
	/////// by using third variable
//	int c;
//	c=a;
//	a=b;
//	b=c;
//	System.out.println(a);
//	System.out.println(b);
	////// without using third variable
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
}
