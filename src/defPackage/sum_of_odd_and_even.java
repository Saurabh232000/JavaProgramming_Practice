package defPackage;
import java.util.*;
public class sum_of_odd_and_even {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter element no:");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println(" enter element");
	{
		for(int k=0;k<=a.length-1;k++)
		{
			a[k]=sc.nextInt();
		}
		int sum=0;
		int sum1=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
			else
			{
				sum1=sum1+a[i];
			}
		}
		System.out.println("for even:-");
		System.out.println(sum);
		System.out.println("for odd:-");
		System.out.println(sum1);
	}
}
}
