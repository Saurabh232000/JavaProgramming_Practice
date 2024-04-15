package Array;

public class missing_no_of_an_array {
	public static void main(String[] args) {
int []a= {1,2,3,4,5,6,7,8,10};
int n=a.length+1;
int sum=0;
int total=n*(n+1)/2;
for(int i=0;i<=a.length-1;i++)
{
	sum=sum+a[i];
}
System.out.println(total-sum);
}
}