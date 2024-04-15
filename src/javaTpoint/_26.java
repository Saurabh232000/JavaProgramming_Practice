package javaTpoint;

import java.util.Scanner;

public class _26 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length");
	int n=sc.nextInt();
	int[]a=new int[n];
	System.out.println("enter element");
    for(int k=0;k<=a.length-1;k++)
    {
    	a[k]=sc.nextInt();
    }
    for(int i=0;i<=a.length-1;i++)
    {
    	for(int j=i+1;j<=a.length-1;j++)
    	{
    		if(a[i]==a[j])
    		{
    			System.out.println(a[i]);
    		}
    	}
    }
}
}
