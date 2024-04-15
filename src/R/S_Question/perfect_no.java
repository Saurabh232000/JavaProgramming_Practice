package R.S_Question;

import java.util.Scanner;

public class perfect_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter a no:");
    int n=sc.nextInt();
    int m=n;
    int sum=0;
    for(int i=1;i<n;i++)
    {
    	if(n%i==0)
    	{
    		System.out.println(i);
    		sum=sum+i;
    	}
    }
    if(sum==m)
    {
    	System.out.println(n+"is perfect");
    }
    else
    {
    	System.out.println(n+" is not perfect");
    }
}
}
