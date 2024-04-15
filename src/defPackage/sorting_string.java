package defPackage;
import java.util.*;
public class sorting_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" how mant string you want");
	int n=sc.nextInt();
	String[]a=new String[n];
	System.out.println(" enter String");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.next();
	}
	String temp;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i].compareTo(a[j])>0)
					
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[i]);
	}
}
}
