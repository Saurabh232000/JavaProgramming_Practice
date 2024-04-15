package defPackage;
import java.util.*;
public class appear_once {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" entr element:");
	int n=sc.nextInt();
	int[]a=new int[n];
	System.out.println(" enter no");
	for(int k=0;k<=a.length-1;k++)
	{
		a[k]=sc.nextInt();
	}
	// 1,2,4,6,4,1,2
	int once=a[0];
	for(int i=1;i<=a.length-1;i++)
	{
		once=once^a[i];
	}
	System.out.println(once);
}
}
