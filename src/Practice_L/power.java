package Practice_L;

import java.util.Scanner;

public class power {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter base:");
	int b=sc.nextInt();
	System.out.println("enter power:");
	int p=sc.nextInt();
	int power=1;
	for(int i=1;i<=p;i++)
	{
		power=power*b;
	}
	System.out.println(power);
}
}
