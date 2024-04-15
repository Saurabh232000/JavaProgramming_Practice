package defPackage;
import java.util.*;
public class searching_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter string");
	int s=sc.nextInt();
	String[]a=new String[s];
	System.out.println("enter elememt");
	for(int k=0;k<=a.length-1;k++)
	{
	a[k]=sc.next();	
	}
	int index=0;
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i].equals("ram"))
		{
			index=i;
			System.out.println(a[i]+index);
		}
	}
}
}
