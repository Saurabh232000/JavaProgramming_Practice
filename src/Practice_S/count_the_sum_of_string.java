package Practice_S;

import java.util.Scanner;

public class count_the_sum_of_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String:");
	String s=sc.nextLine();
	char[]c=s.toCharArray();
	int sum=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		sum=sum+s.charAt(i);
	}
	System.out.println(sum);
}
}
