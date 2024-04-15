package Practice_A;

public class missing_element {
public static void main(String[] args) {
	// Scanner sc=new Scanner(System.in);
//  int n=sc.nextInt();
//	int[]a=new int[n];
//	System.out.println("enter array elements:");
//	for(int k=0;k<=a.length-1;k++)
//	{
//		a[k]=sc.nextInt();
//	}
	int[]a= {1,2,3,4,5,7};
	int n=a.length+1; //7
	int missing=n*(n+1)/2; //7*8/2=28
	int sum=0;
	for(int i=0;i<=a.length-1;i++)
	{
		sum=sum+a[i];//22
	}
	System.out.println(sum);
	System.out.println(missing-sum);
}
}
