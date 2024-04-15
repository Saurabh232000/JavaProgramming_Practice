package R.S_Question;

public class iegnt {
public static void main(String[] args) {
	int a[]= {23,11,23,43,11,34,67,11,23};
	int count=0;
	int search=23;
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]==search)
		{
			count++;
			System.out.println(a[i]+" "+i+" "+count);
			
		}
		if(count>=1)
		{
			break;
        }
	}
}
}
