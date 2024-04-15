package javaTpoint;

public class _14 {// strong no
public static void main(String[] args) {
	int n=14;
	int m=n;
	int sum=0;
	while(n!=0)
	{
		int r=n%10;
		sum=sum+fact(r);
		n=n/10;
	}
	if(sum==m)
	{
		System.out.println(m+" "+" is Strong no");
	}
	else
	{
		System.out.println(m+" "+" is not Strong no");
	}
}
public static int fact(int r)
{
	int fact=1;
	for(int i=1;i<=r;i++)
	{
		fact=fact*i;
	}
	return fact;
}
}
