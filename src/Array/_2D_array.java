package Array;
import java.util.*;
public class _2D_array {
public static void main(String[] args) {
	int a[][]= {{10,20,30,40},{50,60},{70,80,90}};
	System.out.println(a);
	System.out.println(a[0]);
	System.out.println(a[0][0]);
	System.out.println(a.length);
	System.out.println(a[0].length);
	System.out.println(a[1].length);
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	String ab[][]= {{"saurabh","abhishek","kundan","abhishek"},{"priyanka","rajni"},{"anni","aryan","saurya"}};
	for(String[]il:ab)
	{
		for(String j:il)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
