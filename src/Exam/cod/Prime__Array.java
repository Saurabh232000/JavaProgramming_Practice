package Exam.cod;

public class Prime__Array {
public static void main(String[] args) {
	int[]a= {2,4,8,9,13,17};
	// each prime no index contain prime no or not
	int n=20;
	int count=0;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=1;j<n;j++)
		{
			if(a[i]%j==0)
			{
				count++;
				break;
			}
		}
	}
	System.out.println(count);
	for(int i=0;i<a.length-1;i++)
	{
		//if(count==1)
		//{
			System.err.println(i);
		//}
	}
}
}
