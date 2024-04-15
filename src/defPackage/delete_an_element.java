package defPackage;
import java.util.*;
public class delete_an_element {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter no of element");
	int n=sc.nextInt();
	int[]a=new int[n];
	System.out.println(" enter array elem:");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	//10,20,80,30,60,20
	System.out.println("enter number to delete");
	int del_elemnt=sc.nextInt();
	int d=0;
	int arr[]=new int[n-1];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==del_elemnt)
		{
			continue;
		}
		else
		{
			arr[d++]=a[i];
		}	
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
