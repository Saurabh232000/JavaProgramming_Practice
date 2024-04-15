package javaTpoint;

public class _35 {
public static void main(String[] args) {
	int[]a= {1,23,5,6,78,1,5,56,6};
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[i]);
			}
		}
	}
	int[]a1= {1,23,5,6,78,1,5,56,6};
	for(int i=0;i<=a1.length-1;i++)
	{
		for(int j=i+1;j<=a1.length-1;j++)
		{
			if(a1[i]==a1[j])
			{
				a1[i]=-1;
				a1[j]=-1;
			}
		}
	}
	for(int i=0;i<=a1.length-1;i++)
	{
		if(a1[i]!=-1)
		{
			System.out.println(a1[i]);
		}
	}
}
}
