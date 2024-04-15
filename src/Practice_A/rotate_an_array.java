package Practice_A;

import java.util.Scanner;

public class rotate_an_array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:of element:");
	int n=sc.nextInt();
	int[]a=new int[n];
	System.out.println("enter element:");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
//	int[]a= {8,2,9,2,1,2,2,2,4,3};
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			System.out.print(a[j]+" ");
		}
		for(int k=0;k<i;k++)
		{
			System.out.print(a[k]+" ");
		}
       System.out.println(" ");
	}
}
}
