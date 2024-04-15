package javaTpoint;

public class _34 {
public static void main(String[] args) {
	int[]a= {10,23,5,6,78,1,56};
	for(int i=0;i<=a.length-1;i++)
	{
		int temp;
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
	for(int i=0;i<=a.length-1;i++)
	{
		System.err.println(a[0]);
		System.err.println(a[1]);
		break;
	}
}
}
