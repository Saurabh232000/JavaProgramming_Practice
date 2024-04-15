package loop;

import java.util.Scanner;

public class perfect_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int n=sc.nextInt();
	int temp=n;
	int sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
			sum=sum+i;
		}
	}
	if(temp==sum)
	{
		System.out.println(temp+ " is perfect");
	}
	else
		System.out.println(temp+ " is not perfect");
}
}
