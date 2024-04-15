package Practice_A;

import java.util.Scanner;

public class second_smallest {
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
	int temp;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
  for(int i=0;i<=a.length-1;i++)
  {
	  System.out.println(a[i]);
  }
  System.out.println("second smallest is"+a[1]);
}
}
