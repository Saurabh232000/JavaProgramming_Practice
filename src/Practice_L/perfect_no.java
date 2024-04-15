package Practice_L;

import java.util.Scanner;

public class perfect_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int n=sc.nextInt();
	int m=n;
	int sum=0;
	for(int i=1;i<n;i++)
	{
		
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(n==sum)
	{
		System.out.println("no is perfect");
	}
	else
	{
		System.out.println("no is not perfect");
	}
}
}
