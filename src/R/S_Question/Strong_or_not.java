package R.S_Question;

import java.util.Scanner;

public class Strong_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no00");
	int n=sc.nextInt();
	int m=n;
	int sum=0;
	while(n!=0)
	{
		int r=n%10;
		sum=sum+fact(r);
		n=n/10;		
	}
	if(sum==m)
	{
		System.out.println(" no is strong");
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
