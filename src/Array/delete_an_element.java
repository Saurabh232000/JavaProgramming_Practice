package Array;

public class delete_an_element {
public static void main(String[] args) {
	int []a= {10,20,30,40,50};
	int delete_element=40;
	for( int i=0;i<a.length-1;i++)
	{
		if(delete_element==a[i])
		{
			for( int j=i;j<a.length-1;j++)
			{
			a[j]=a[j+1];
		}
       break;
}
	}
	for(int i=0;i<a.length-1;i++)
	{
		System.out.println(a[i]);
	}
}
}
