package defPackage;
import java.util.*;
public class find_duplicate_element {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter element no:");
	int n=sc.nextInt();
	int []a=new int[n];
	System.out.println(" enter element");
		for(int k=0;k<=a.length-1;k++)
		{
			a[k]=sc.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i;j<=a.length-1;j++)
			{
				if(a[i]==a[j] && i !=j)
				{
					System.out.println(a[i]);
				}
			}
		}
}
}
