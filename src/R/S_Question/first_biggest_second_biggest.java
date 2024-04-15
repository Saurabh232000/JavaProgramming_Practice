package R.S_Question;

public class first_biggest_second_biggest {
public static void main(String[] args) {
	int[]a= {10,45,70,24,60};
	int temp;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i]<a[j]&&i!=j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<=a.length-1;i++)
	{

		System.out.println(a[i]);
	}
	System.err.println(a[0]);
	System.err.println(a[1]);
}
}
