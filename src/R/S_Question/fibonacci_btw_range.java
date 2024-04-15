package R.S_Question;

import java.util.Scanner;

public class fibonacci_btw_range {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int a=sc.nextInt();
	System.out.println("enter another no:");
	int b=sc.nextInt();
	System.out.println("enter no less than");
	int ne=sc.nextInt();
	for(int i=a;i<=b;i++)
	{
		int n=0;
		int m=1;
		int temp;
		for(int j=1;j<=i;j++)
		{
			temp=n+m;
			n=m;
			m=temp;
			System.out.println(temp);
			if(temp>=ne)
	    	{
	    		break;
	    	}
		}
		System.out.println();
	}
}
}
