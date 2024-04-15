package defPackage;
import java.util.*;
import java.lang.*;
public class common_from_three_array {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter no of element");
	int n=sc.nextInt();
	int a[]=new int [n];
	System.out.println("enter no:");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	// 2,4,8,10
	System.out.println("enter another no of elements");
	int m=sc.nextInt();
	int[]b=new int[m];
	System.out.println("enter no:");
	for(int l=0;l<=b.length-1;l++)
	{
		b[l]=sc.nextInt();
	}
	// 2,3,4,8,10,16
	System.out.println(" enter no of element");
	int o=sc.nextInt();
	int c[]=new int [o];
	System.out.println("enter no:");
	for(int y=0;y<=c.length-1;y++)
	{
		c[y]=sc.nextInt();
	}
	// 2,8,10,14,40
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=b.length-1;j++)
		{
			for(int g=0;g<=c.length-1;g++)
			{
				
			   if(a[i]==b[j]&& b[j]==c[g])
			{
				System.out.println(a[i]);
			}
		}
	}
}

for(int i=0;i<=b.length-1;i++)
{
	System.out.println(a[i]);
}
}
}