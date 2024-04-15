package Array;

public class maximum_element {
public static void main(String[] args) {
	int []a= {3,6,8,9,56,4,7};
	int max=a[0];
	int temp;
	for(int i=0;i<=a.length-1;i++)
//	{
//		if(a[i]>max)
//		{
//			max=a[i];
//		}
//	}
//	System.out.println(max);
	{
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print(a[i]+ " ");
	}
	System.err.println(a[0]);
	System.err.println(a[3]);
}
}
