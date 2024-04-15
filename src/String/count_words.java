package String;
import java.util.*;
public class count_words {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enteer string");
	String c= sc.next();
	int count=0;
	for(int i=0;i<=c.length()-1;i++)
	{
		count++;
	}
	System.out.println(count);
}
}
