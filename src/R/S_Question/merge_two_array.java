package R.S_Question;

public class merge_two_array {
	public static void main(String[] args) {
int[]a= {10,20,30};
int[]b= {40,50,60};
//int a_length=a.length;
//int b_length=b.length;
//int n=a_length+b_length;
int[]c=new int[a.length+b.length];
for(int i=0;i<=a.length-1;i++)
{
	c[i]=a[i];
}
for(int j=0;j<=b.length-1;j++)
{
	c[j+a.length]=b[j];
}
for(int i=0;i<=c.length-1;i++)
{
System.out.println(c[i]);	
}
	}
}
