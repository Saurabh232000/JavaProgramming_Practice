package loop;
import java.util.*;
public class prime_no_between_range {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" entere range 1");
	int a=sc.nextInt();
	System.out.println(" enter range 2");
	int b= sc.nextInt();
	//int count=0;
	for(int i=a;i<=b;i++)
	{
	int	count = 0;
		for(int j=2;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(i);
		}
	}
}
}
