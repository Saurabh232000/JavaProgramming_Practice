package R.S_Question;
import java.util.*;
public class reverse_ {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int n=sc.nextInt();
	int rev=0;
	while(n!=0)
	{
		int r=n%10;
		rev=rev*10+r;
		n/=10;
	}
	System.out.println(rev);
}
}