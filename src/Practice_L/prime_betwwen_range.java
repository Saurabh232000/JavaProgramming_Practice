package Practice_L;

import java.util.Scanner;

public class prime_betwwen_range {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no1:");
	int a=sc.nextInt();
	System.out.println("entr no2:");
	int b=sc.nextInt();
	for(int i=a;i<=b;i++)
	{
		int count=0;
		int n=i;
		for(int j=2;j<n;j++)
		{
			if(n%j==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(i);
		}
	}
}
}
