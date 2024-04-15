package Array;

public class mnimum_element {
public static void main(String[] args) {
	int []a= {37,6,8,9,56,4,7};
//	int min=a[0];
	int temp;
	for(int i=0;i<=a.length-1;i++)
//	{
//		if(a[i]<min)
//		{
//			min=a[i];
//		}
//	}
//	System.out.println(min);
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
		System.out.print(a[i]+ " ");
	}
	System.err.println(a[0]);
}
}
