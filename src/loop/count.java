package loop;
import java.util.*;
public class count {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter number:");
	int n= sc.nextInt();
	int count=0;
	while(n!=0)
	{
		int r=n%10;
		n=n/10;
		count++;
	}
	System.out.println(count);
}
}
