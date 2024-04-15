package Practice_L;

import java.util.Scanner;

public class Strong_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int m=n;
	int sum=0;
	while(n!=0)
	{
		int r=n%10;
		sum=sum+fact(r);
		n=n/10;
	}
	System.out.println(sum);
	if(sum==m)
	{
		System.out.println(" no is strong ");
	}
	else
	{
		System.out.println("no is not strong");
	}
}
public static int fact(int r)
{
	int fact=1;
	for(int i=1;i<=r;i++)
	{
		fact=fact*i;
	}
	return fact;
}
}
