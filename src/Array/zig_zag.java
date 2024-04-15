	package Array;

public class zig_zag {
public static void main(String[] args) {
	int []a= {3,5,7,9,8,10};
	String b="saurabh";
	for(int i=0;i<a.length-1;i++)
	{
	if(a[i]<a[i+1])
	{
		a[i]=a[i+1];
	}
	//System.out.println(a[i]);
	}
//	System.out.println(a.hashCode());
//	System.out.println(b.hashCode());
	System.out.println(b.replace("saurabh", "abhishek"));
}
}
