package R.S_Question;

public class first_half_in_ascen_second_in_desc {
public static void main(String[] args) {
	int[]a= {10,40,20,50,60,30};
	int temp;
	for (int i = 0; i < a.length/2; i++) 
	{
		for (int j = i; j < a.length/2; j++)
		{
			if(a[i]>a[j] &&i!=j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length/2;i++)
	{
		System.out.println(a[i]);
	}
	int temp1;
	for (int i =  a.length/2; i<=a.length-1;i++) 
	{
		for (int j =i; j<=a.length-1;j++)
		{
			if(a[i]<a[j] &&i!=j)
			{
				temp1=a[i];
				a[i]=a[j];
				a[j]=temp1;
			}
		}
	}
	for(int i=a.length/2;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
}
}
