package defPackage;
import java.util.*;
public class RotateArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of array element");
		int r=sc.nextInt();
		int a[]=new int[r];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("before rotation");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("enter number of rotation");
		int n=new Scanner(System.in).nextInt();
		int arr1[]=Arrays.copyOf(a, a.length);
		for(int i=0;i<n;i++)
		{
			arr1=rotate(arr1);
		}
		System.out.println("after rotation");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
static int[] rotate(int arr[])
{
	int[] arr1=new int[arr.length];
	int num=arr[arr.length-1];
	int k=0;
	for(int i=1;i<arr1.length;i++)
	{
		arr1[i]=arr[k++];
	}
	arr1[0]=num;
	return arr1;
}
}


