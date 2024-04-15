package javaTpoint;

public class _3 {
public static void main(String[] args) {
	int n=123;
	int m=n;
	int rev=0;
	while(n!=0)
	{
		int r=n%10;
		rev=rev*10+r;
		n/=10;
	}
	if(rev==m)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
