package String;

public class sort_name {
	public static void main(String[] args) {
String name="saurabh";
char[] cname=name.toCharArray();
char temp;
for(int i=0;i<cname.length-1;i++)
{
for(int j=i;j<=cname.length-1;j++)
{
	if(cname[i]>(cname[j]))
	{
		temp=cname[i];
		cname[i]=cname[j];
		cname[j]=temp;
	}
}
}
for(int i=0;i<cname.length;i++)
{
	System.out.println(cname[i]);
}
	}
}
