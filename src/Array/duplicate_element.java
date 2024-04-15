package Array;

public class duplicate_element {
public static void main(String[] args) {
	int []a= {37,6,8,9,56,4,7,37,9,7};
	//System.out.println(a.length);
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]==a[j] )
			{
				System.out.println(a[i]);
				
			}
		}
	}
}
}
