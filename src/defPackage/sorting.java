package defPackage;
import java.util.*;
public class sorting {
public static void main(String[] args) {
	//int []a= {48,36,15,52,19,94,21};
	Scanner sc=new Scanner(System.in);
	System.out.println("enteer a no:");
	int n=sc.nextInt();
	int []a=new int[n];
	for(int k=0;k<=a.length-1;k++)
	{
		 a[k]=sc.nextInt();
	}
	int temp;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	//	System.out.println(a[i]);
	}
	System.out.println("sorted erray");
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
		
	}
}
}
