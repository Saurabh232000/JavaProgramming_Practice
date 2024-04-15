package R.S_Question;

import java.util.Scanner;

public class fibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int n=sc.nextInt();
	int a=0;
    int b=1;
    int temp;
    for(int i=1;i<=n;i++)
    {
    	temp=a+b;
    	a=b;
    	b=temp;
    	System.out.println(temp);
    }
}
}
