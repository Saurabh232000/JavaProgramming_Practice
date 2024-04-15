package R.S_Question;

import java.util.Scanner;

public class swap_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no1");
	int n=sc.nextInt();
	System.out.println("enter no2");
	int m=sc.nextInt();
	int temp;
	temp=n;
	n=m;
	m=temp;
	System.out.println(n);
	System.out.println(m);
}
}
