package javaTpoint;

public class _31 {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6};
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			System.out.print(a[j]);
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print(a[k]);
		}
		System.out.println();
	}
	System.out.println("________________");
	for(int i=a.length-1;i>=0;i--)
	{
		for(int j=a.length-1;j>=i+1;j--)
		{
			System.out.print(a[j]);
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print(a[k]);
		}
		System.out.println();
	}
}
}
