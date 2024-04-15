package Practice_A;

public class anonomos_array {
public static void main(String[] args) {
	anonomos_array.sum(new int[] {10,20,30,40});
}
static int sum(int[] n)
{
	int sum=0;
	for(int i=0;i<=n.length-1;i++)
	{
		sum=sum+n[i];
	}
	System.out.println(sum);
	return sum;
}
}
