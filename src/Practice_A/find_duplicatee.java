package Practice_A;

import java.util.Scanner;

public class find_duplicatee {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int []a=new int[n];
	System.out.println("enter elements:"+" ");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();//[10,20,30,20,30]
	}
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i]==a[j]&&i!=j)
			{
				System.out.println(a[i]);
			}
		}
	}
}
}
