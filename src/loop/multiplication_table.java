package loop;
import java.util.*;
public class multiplication_table {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter no:");
	int n= sc.nextInt();
	for(int i=0;i<=10;i++)
	{
		System.err.println(n*i);
	}
	// for multiplication table upto  10
	for(int j=1;j<=15;j++)
	{
		for(int k=1;k<=10;k++)
		{
			System.out.print(j*k+ " ");
		}
		System.out.println(" ");
	}
}
}
