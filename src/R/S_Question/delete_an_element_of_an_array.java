package R.S_Question;
import java.util.*;
public class delete_an_element_of_an_array {
public static void main(String[] args) {
	int[]a= {3,6,8,11,15,21};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter dlete element");
	int delete=sc.nextInt();
	int n[]=new int[a.length-1];
	int count=0;
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]==delete)
		{
			continue;
		}
		n[count++]=a[i];
	}
	for(int i=0;i<=n.length-1;i++)
	{
		System.out.println(n[i]);
	}
}
}
