package javaTpoint;

public class _40 {
public static void main(String[] args) {
	String s="Aebhiseek";
	char[]a=s.toCharArray();
	int count=0;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				System.out.println(a[i]+" "+count);
			}
		}
	}
}

