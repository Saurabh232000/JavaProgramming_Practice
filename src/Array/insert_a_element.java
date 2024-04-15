package Array;

public class insert_a_element {
public static void main(String[] args) {
	int []a= {10,20,30,40,50};
	int pos=3;
	int element=100;
	for(int i=a.length-1;i>pos-1;i--)
	{
		a[i]=a[i-1];
	}
	a[pos-1]=element;
	for(int i=0;i<=a.length-1;i++)
	System.err.print(a[i]+" "+"\n");
	System.err.println("\n");
    //   add the element   the index positin
int []b= {10,20,30,40,50};
int index=3;
int element1=100;
for(int i=b.length-1;i>index;i--)
{
b[i]=b[i-1];
}
b[index]=element1;
for(int i=0;i<=b.length-1;i++)
System.out.print(b[i]+" ");
}
}
