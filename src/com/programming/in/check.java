package com.programming.in;
import java.util.*;
public class check {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter a  character:");
	char c=sc.next().charAt(0);
	System.out.println(" enter another   character:");
	char d=sc.next().charAt(0);
	 int e = (int) (Math.pow(c, 2) - (Math.pow(d, 2) / 2));
     System.out.println(e);
}
}