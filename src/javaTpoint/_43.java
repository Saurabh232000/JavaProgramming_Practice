package javaTpoint;

public class _43 {
public static void main(String[] args) {
	/*String s="abbccddd";
	char[]a=s.toCharArray();
	int temp=0;
	char ch1='z';
	for(int i=0;i<=a.length-1;i++)
	{
		char ch=s.charAt(i);
		int count=1;
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i]==a[j]&&i!=j)
			{
             count++;
             a[j]=' ';
			}
		}
		if(a[i]!=' ')
		{
			System.out.println(a[i]+" "+count);
		}
		if(count>temp)
		{
			temp=count;
			ch1=ch;
		}
	}
	System.out.println(ch1+" "+temp);*/
	String s="abbabddddccc";
	char[]c=s.toCharArray();
	for(int i=0;i<=c.length-1;i++)
	{
		int count=1;
		for(int j=i+1;j<=c.length-1;j++)
		{
			if(c[i]==c[j]&&i!=j)
			{
				count++;
			}
		}
		System.out.println(c[i]+" "+count);
		i=i+count-1;
	}
	System.out.println("______");
int max=s.indexOf(0);
char ch=' ';
for(int i=1;i<=c.length-1;i++)


{
	if(c[i]>max)
	{
		max=c[i];
		ch=s.charAt(i);
	}
}
System.out.println(ch+" "+max);
}
}
