package Array;
import java.util.*;
public class delte_an_element {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter length:");
	int n=sc.nextInt();
	int[]a=new int[n];
	System.out.println(" enter element");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	System.out.println(" enter deelete eleement ");
	int del=sc.nextInt();
	int d=0;
	int ar[]=new int[n-1];
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]==del)
		{
			continue;
		}
		ar[d++]=a[i];
	}
	for(int i=0;i<=ar.length-1;i++)
	{
	System.out.println(ar[i]);
}
}
}