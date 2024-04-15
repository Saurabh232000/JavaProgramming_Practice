package Array;

public class common_element_from_three_array {
public static void main(String[] args) {
	int[]a= {2,4,8,10};
	int[]b= {2,3,4,8,10,16};
	int[]c= {2,8,10,14,40};
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=b.length-1;j++)
		{
			for(int k=0;k<=c.length-1;k++)
			{
				if(a[i]==b[j]&& b[j]==c[k])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
}
