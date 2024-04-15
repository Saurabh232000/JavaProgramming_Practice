package Array;

public class single_element_appears_once_in_array {
public static void main(String[] args) {
	int []a= {1,2,5,3,4,5,2,3,4};
	int result=a[0];
	for(int i=1;i<=a.length-1;i++)
	{
		result=result^a[i];
	}
	System.out.println(result);
}
}
