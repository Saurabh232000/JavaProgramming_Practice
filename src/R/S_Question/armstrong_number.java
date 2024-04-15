package R.S_Question;

import java.util.Scanner;

public class armstrong_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter a nO:");
    int n=sc.nextInt();
    int temp=n;
    double sum=0;
    while(temp!=0)
    {
    int r=temp%10;
    sum=sum+Math.pow(r,count(temp));
    }
    if(sum==n)
    {
    	System.err.println(n+ " is armstrong");
    }
    else
    {
    	System.out.println(n +" is not armstrong");
    }
}
public static int count(int n)
{
	int count=0;
	while(n!=0)
	{
		int r=n%10;
		n/=10;
		count++;
	}
	return count++;
}
}
