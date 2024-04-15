package Array;

public class second_smallest {
public static void main(String[] args) {
	int []a= {3,6,8,9,56,4,7};
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
		System.out.print(a[i]+ " ");
	}
	System.err.println(a[1]);
}
}
