package R.S_Question;

import java.util.Scanner;

public class fact_btw_range {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no1");
	int a =sc.nextInt();
	System.out.println("enter no2");
	int b=sc.nextInt();
	for(int i=a;i<=b;i++)
	{
		int fact=1;
		for(int j=1;j<=i;j++)
		{
			fact=fact*j;
		}
		System.out.println(fact);
	}
}
}
