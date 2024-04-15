package javaTpoint;

public class _24 {
public static void main(String[] args) {
//	int[]a= {1,2,3,4,1,2,2,5,6};
//	for(int i=0;i<=a.length-1;i++)
//	{
//		int count=0;
//		for(int j=0;j<=a.length-1;j++) {
//			if(a[i]==a[j])
//			{
//				count++;
//			}
//		}
//				System.out.println(a[i]+" ="+count);
//	}

	String s="saurabh";
	for(int i=0;i<=s.length()-1;i++)
	{
		char c=s.charAt(i);
		int count=0;
		for(int j=0;j<=s.length()-1;j++)
		{
			char c1=s.charAt(j);
			if(c==c1)
			{
				count++;
			}
		}
		System.out.println(s.charAt(i)+"="+count);
	}
	char max=s.charAt(0);
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)>max)
		{
			max=s.charAt(i);
		}
	}
	System.out.println(max+" ");

}

