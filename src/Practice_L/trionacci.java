package Practice_L;
import java.util.*;
public class trionacci {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=1;
		int temp;
		for(int i=1;i<=n;i++)
		{
			temp=a+b+c;
			b=c;
			c=a;
			a=temp;
			System.out.println(temp);
		}
	}
	}
