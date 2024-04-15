import Exam.cod.main;
import java.util.*;
public class us9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int n=sc.nextInt(); //1
	int m=n;
	int sum=0;
	while(m!=0)
	{
		int r=m%10;//0
		sum=sum*10+r;//32
		m=m/10;//1
	}
	if(sum==n)
	{
		System.out.println(n+" "+"is palindrome");
	}
	else
	{
		System.out.println(n+" "+"is not palindrome");
	}
}
}
