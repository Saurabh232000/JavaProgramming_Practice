package javaTpoint;

public class _32 {
public static void main(String[] args) {
	int[]a= {10,23,5,6,78,1,56};
	int temp;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[i]);
	}
	System.out.println("in decending order:");
	int temp1;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i]<a[j])
			{
				temp1=a[i];
				a[i]=a[j];
				a[j]=temp1;
			}
		}
		System.out.println(a[i]);
	}
}
}
