package defPackage;
import java.util.*;
public class searching {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a no:");
	int n= sc.nextInt();
	int[]a=new int[n];
	System.out.println(" enter element");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	//     int[]a= {2,5,8,9,4,7};
	int index=0;
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]==9)
		{
			index=i;
			System.out.println(index +" "+ a[i]);
		}
	}
}
}
