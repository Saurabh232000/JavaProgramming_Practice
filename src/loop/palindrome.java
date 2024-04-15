package loop;
import java.util.*;
public class palindrome {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter a  number:");
	int n= sc.nextInt();
	int rev=0;
	int temp=n;
	while(n!=0)
	{
		int r=n%10;
		rev= rev*10+r;
		n=n/10;
	}
	if(rev==temp)
	{
		System.out.println(" no is palindrome");
	}
	else
	{
		System.out.println("no is not palindrome");
	}
}
}
