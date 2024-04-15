package javaTpoint;

public class _15 {
public static void main(String[] args) {
	int n=29;
	int m=n;
	int sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	System.out.println(sum);
	System.out.println();
	if(sum==m)
	{
		System.out.println(m+ " is perfect");
	}
	else
	{
		System.out.println(m+ " is not  perfect");
	}
}
}
