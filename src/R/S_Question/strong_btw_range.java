package R.S_Question;

import java.util.Scanner;

public class strong_btw_range {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no1");
	int a=sc.nextInt();
	System.out.println("enter no2");
	int b=sc.nextInt();
	for(int i=a;i<=b;i++)
	{
		int n=i;
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		if(sum==i)
		{
			System.out.println(i);
		}
	}
}
public static int fact(int n)
{
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	return fact;
}
}
