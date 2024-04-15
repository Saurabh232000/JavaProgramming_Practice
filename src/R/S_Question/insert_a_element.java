package R.S_Question;
import java.util.*;
public class insert_a_element {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[]a= {3,4,6,7,8,9};
//	int[]n=new int[a.length+1];
	System.out.println("enter inseert element:");
	int add_element=sc.nextInt();
	System.out.println("enter position:");
	int pos=sc.nextInt();
	for(int i=a.length-1;i>=pos;i--)
	{
		a[i]=a[i-1];
	}
	a[pos]=add_element;
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
System.out.println("________delete from array_________");
	int[]b= {1,2,3,4,5,6};   //1,2,3,5,6
	int del=4;
	int[]n=new int[b.length-1];
	int d=0;
	for(int i=0;i<=b.length-1;i++)
	{
		if(b[i]==del)
		{
			continue;
		}
		n[d++]=b[i];
	}
	for (int i = 0; i < n.length; i++)
	{
		System.out.println(n[i]);
	}
}
}
