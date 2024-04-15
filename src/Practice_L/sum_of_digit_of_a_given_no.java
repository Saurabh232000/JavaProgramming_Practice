package Practice_L;

import java.util.Scanner;

public class sum_of_digit_of_a_given_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int sum=0;
	while(n!=0)
	{
		int r=n%10;
		sum=sum+r;
		n=n/10;
	}
	System.out.println(sum);
}
}
