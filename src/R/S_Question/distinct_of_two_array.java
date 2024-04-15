package R.S_Question;

public class distinct_of_two_array {
public static void main(String[] args) {
	int []a= {10,20,30,40};
	int[]b= {20,40,60,80};
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
