package Array;
import java.util.*;
public class buuble_sort {
	public static void main(String[] args) {
int a[]= {5,64,6,2,6,2,2,6,7,145};
int temp;
for(int i=0;i<a.length;i++)
{
	for(int j=i;j<a.length;j++)
	{
	    if(a[i]>a[j])
	    {
	    	temp=a[i];
	    	a[i]=a[j];
	    	a[j]=temp;
	    }
	}
}
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}

//TreeSet<Integer>value=new //TreeSet<>();
//for(int i=0;i<a.length;i++) {
// value.add(a[i]);
//}
//for( Integer k:value)
//{
//	System.out.println(k);
}
}
