package com.programming.in;
import java.util.*;
public class quotient_remainder {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter dividend:" );
	int divi=sc.nextInt();
	System.out.println("enter divisor");
	int div=sc.nextInt();
	int remainder=divi%div;
	int quotient=divi/div;
	System.out.println(quotient);
	System.out.println(remainder);
}
}
