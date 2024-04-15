package String;
import java.util.*;
public class max_min_occurng_in_string {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String name="saurabh abhishek";
	int[]a=new int[127];
	for(int i=0;i<=name.length()-1;i++)
	{
		a[name.charAt(i)]=a[name.charAt(i)]+1;
	}
	int max=-1;
	char c=' ';
	for(int i=0;i<=name.length()-1;i++)
	{
		if(max<a[name.charAt(i)])
		{
			max=a[name.charAt(i)];
			c=name.charAt(i);
		}
	}
	System.out.println("max character are:");
	System.out.println(c);
	int min=-1;
	char ch=' ';
	for(int i=0;i<=name.length()-1;i++)
	{
		if(min>a[name.charAt(i)])
		{
			min=a[name.charAt(i)];
			ch=name.charAt(i);
		}
	}
	System.out.println("min char are:"+ch);
	System.out.println(ch);
}
}
