package Practice_L;

import java.util.Scanner;

public class factor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n0:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
		}
	}
}
}
