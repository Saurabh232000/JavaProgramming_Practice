package Array;

public class firsr_dupliate_element {
public static void main(String[] args) {
	int []a= {37,6,8,9,56,4,7,37,9,7};
	int temp=0;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
				
			{
				System.out.println(a[i]);
				temp=temp+1;
				break; 
			}
		}
		if(temp>0)
		{
			break;
		}
	}
}
}
