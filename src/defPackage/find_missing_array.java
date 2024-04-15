package defPackage;
import java.util.*;;
public class find_missing_array {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println(" enter element no:");
//	int n=sc.nextInt();
//	int[]  a=new int[n];
//	System.out.println(" enter no:");
//		for(int k=0;k<=a.length-1;k++)
//		{
//			a[k]=sc.nextInt();
//		}
	int[ ]a= {1,2,3,4,5,6,7,8,10};
		int na=a.length+1;
		int sum=0;
		int new_sum=na*(na+1)/2;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		int missing_sum=new_sum-sum;
		System.out.println(" missing no:"+ missing_sum);
}
}
