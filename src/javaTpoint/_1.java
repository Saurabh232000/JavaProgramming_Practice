package javaTpoint;
import java.util.*;
public class _1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	int temp;
	for(int i=1;i<=n;i++)
	{
		temp=a+b;
		System.out.println(temp);
		a=b;
		b=temp;
	}
}
}
