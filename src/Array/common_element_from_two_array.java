package Array;

public class common_element_from_two_array {
public static void main(String[] args) {
	int a[]= {4,3,7,9,2};
	int b[]= {5,1,4,8,3};
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=b.length-1;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
			}
		}
	}
}
}
