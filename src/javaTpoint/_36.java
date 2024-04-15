package javaTpoint;

public class _36 {
public static void main(String[] args) {
	int[]a= {1,23,5,78,1,5,56,6};
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
	System.out.println();
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.println(a[i]);
		}
	}
}
}
