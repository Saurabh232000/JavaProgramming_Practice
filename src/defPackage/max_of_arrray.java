package defPackage;
import java.util.*;
public class max_of_arrray {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter no: of elements");
	int n=sc.nextInt();
	int []a=new int[n];
	System.out.println("enter no:");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	// ***** first sorrt then find max
//	int temp;
//	for(int i=0;i<=a.length-1;i++)
//	{
//		for(int j=i;j<=a.length-1;j++)
//		{
//			if(a[i]<a[j])
//			{
//				temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//	}
//	System.out.println("sorted array");
//	for(int i=0;i<=a.length-1;i++)
//	{
//		System.out.println(a[i]);
//	}
//	System.out.println("max:");
//	System.out.println(a[0]);
//	System.out.println("second largest element:"+ a[1]);
	//**************8
	int max=a[0];
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(max);
}
}
