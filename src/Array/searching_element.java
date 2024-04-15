package Array;

public class searching_element {
	public static void main(String[] args) {
int a[]= {36,68,6,68,48};
//int element=6;
int index=0;
for(int i=0;i<=a.length-1;i++)
{
	if(a[i]==6)
	{
		index=i;
		System.out.println(a[i]+ " "+i);
	}
}
}
}