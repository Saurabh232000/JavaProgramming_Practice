package R.S_Question;

import java.util.Scanner;

public class perfect_no_btw_range {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int a=sc.nextInt();
	System.out.println("enter another no:");
	int b=sc.nextInt();
	for(int i=a;i<=b;i++)
	{
		int sum=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
			{
				sum=sum+j;
			}
		}
		if(sum==i)
		{
			System.out.println(i);
		}
			}
}
}