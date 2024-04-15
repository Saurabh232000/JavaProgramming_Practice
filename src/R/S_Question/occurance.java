package R.S_Question;

public class occurance {
public static void main(String[] args) {
	int[]a= {10,20,30,40,50,10,30,20};
	for(int i=0;i<=a.length-1;i++)
	{
		int count=1;
		for(int j=0;j<=a.length-1;j++)
		{
			if(a[i]==a[j]&&i!=j)
			{
				count++;
			}
		}
		System.out.println(a[i]+" "+count);
	}
}
}
