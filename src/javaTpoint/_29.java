package javaTpoint;

public class _29 {
public static void main(String[] args) {
	int[]a= {1,23,5,6,78,1,56};
	int max=a[0];
	int min=a[0];
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(max);
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(min);
}
}
