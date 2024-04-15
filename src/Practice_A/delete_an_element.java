package Practice_A;

import java.util.Scanner;

public class delete_an_element {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no ofelements");
//	int n=sc.nextInt();
//	int[]a=new int[n];
//	System.out.println("enter elementss:");
//	for(int k=0;k<=a.length-1; k++)
//	{
//		a[k]=sc.nextInt();
//	}
	int[]a= {1,2,3,4,5,6,7};
	int del=3;
	int d=0;
	int[] m=new int[a.length-1];
	for(int i=0;i<=a.length-1;i++)
	{
		if(del==a[i])
		{
			continue;
		}
		m[d++]=a[i];
	}
	for(int i=0;i<=m.length-1;i++)
	{
		System.out.println(m[i]);
	}
}
}
