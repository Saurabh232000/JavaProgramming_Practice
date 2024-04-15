package Practice_A;

import java.util.Scanner;

public class smallest_and_largest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int[]a=new int[n];
	System.out.println("enter elements:");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	int max=a[0];
	int min=a[0];
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		else if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(max);
	System.out.println(min);
}
}
