package loop;
import java.util.*;
public class fibonacci {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter no:");
	int n= sc.nextInt();
	int a=0;
	int b=1;
	int temp;
	for(int i=0;i<=n;i++)
	{
		temp=a+b;
		//temp=a;
		a=b;
		b=temp;
		System.out.println(temp);
	}
}
}
