package pattern;

public class pattern10 {
public static void main(String[] args) {
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i==j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			System.out.print("");
		}
		System.out.println();
	}
}
}
