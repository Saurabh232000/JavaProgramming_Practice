package com.programming.in;
import java.util.*;
public class find_max_enter_by_user {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter no:");
	int n=sc.nextInt();
	int []a=new int[n];
	int temp;
	System.out.println(" enter array elemrnt");
	 for(int i=0;i<n;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 for(int j=0;j<=a.length-1;j++)
	 {
		 for(int k=j+1;k<=a.length-1;k++)
		 {
			 if(a[j]<a[k])
			 {
				 temp=a[j];
				 a[j]=a[k];
				 a[k]=temp;
			 }
		 }
		
		 System.out.println(a[j]+" ");
	 }
	 System.out.println(" max element is "+ a[0]);
}
}
