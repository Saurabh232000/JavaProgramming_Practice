package Practice_B;

import java.util.Scanner;

public class leap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		if(n%4==0)
		{
			System.out.println("this is leap yeaar ");
		}
		else
		{
			System.out.println("this is not leap year");
		}
}
}