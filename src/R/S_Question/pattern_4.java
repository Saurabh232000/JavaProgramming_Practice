package R.S_Question;

public class pattern_4 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i==j)
			{
				System.out.println("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
	}
	for(int k=1;k<=5;k++)
	{
		for(int j=5;j>=k;j--)
		{
			if(k==j)
			{
				System.out.println("*");
			}
			else {
				System.out.print(" ");
			}
		}
	}
}
}

