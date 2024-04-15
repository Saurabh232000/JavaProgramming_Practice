package R.S_Question;

public class biigest_and_smallest_of_an_array {
public static void main(String[] args) {
	int a[]= {23,34,45,67,79};
	int max=a[0];
	int min=a[0];
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		else if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(max);
	System.out.println(min);
}
}
