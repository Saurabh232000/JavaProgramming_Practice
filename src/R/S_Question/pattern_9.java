package R.S_Question;

public class pattern_9 {
public static void main(String[] args) {
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<i*2;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=7;k>i*2;k--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
