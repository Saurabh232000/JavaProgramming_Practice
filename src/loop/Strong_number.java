package loop;

import java.util.Scanner;

public class Strong_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int m=n;//145
	int sum=0;
	while(n!=0)
	{
		int r=n%10;  //5 ,4,1
		sum=sum+fact(r); //0+120+24+1=145
	    n=n/10;
	}
	if(sum==m)
	{
		System.out.println("no is strong");
	}
	else
	{
		System.out.println(" no is not strong");
	}
}
public static int fact(int a)
{
	int fact=1;
	for(int i=1;i<=a;i++)
	{
		fact=fact*i;
	}
	return fact;
}
}
