package defPackage;
import java.util.*;
public class common_element_from_two_array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter no of element");
	int n=sc.nextInt();
	int a[]=new int [n];
	System.out.println("enter no:");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	// 4,3,7,9,2
	System.out.println("enter another no of elements");
	int m=sc.nextInt();
	int[]b=new int[m];
	System.out.println("enter no:");
	for(int l=0;l<=b.length-1;l++)
	{
		b[l]=sc.nextInt();
	}
	// 5,1,4,8,3
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=b.length-1;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
			}
		}
	}
}
}
