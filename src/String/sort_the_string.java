package String;

public class sort_the_string {
	public static void main(String[] args) {
String []s= {"deepak","amit","rahul" ,"vironika","deepesh","rohit"};
String temp;
for(int i=0;i<=s.length-1;i++)
{
	for(int j=i;j<=s.length-1;j++ )
	{
		if(s[i].compareTo( s[j])>0)
		{
			temp=s[i];
			s[i]=s[j];
			s[j]=temp;
		}
	}
}
for(int i=0;i<=s.length-1;i++)
{
	System.out.println(s[i]);
}
}
}