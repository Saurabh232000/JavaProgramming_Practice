package Array;

public class merge_two_array {
public static void main(String[] args) {
	int[]a= {10,20,30};
	int []b= {40,50,60,70};
	int a_length=a.length;
	int b_length=b.length;
	int c_length=a.length+b.length;
	int []c=new int[c_length];
	for(int i=0;i<=a.length-1;i++)
	{
		c[i]=a[i];
	}
	for(int i=0;i<=b.length-1;i++)
	{
		c[a.length+i]=b[i];
	}
	for(int i=0;i<=c.length-1;i++)
	{
		System.out.println(c[i]);
	}
}
}
