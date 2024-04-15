package Exam.cod;

public class check {
public static void main(String[] args) {
	String s="abbdddcccd";
	int[]a=new int[127];
	for(int i=0;i<=s.length()-1;i++)
	{
		a[s.charAt(i)]=a[s.charAt(i)]+1;
		System.out.println(s.charAt(i)+" "+a[s.charAt(i)]);
	}
	int max=-1;
	char c=' ';
	for(int i=0;i<=s.length()-1;i++)
	{
		if(max<a[s.charAt(i)])
		{
			max=a[s.charAt(i)];
			c=s.charAt(i);
		}
	}
	System.out.println(max+"="+c);
	System.out.println("__________");
	int min=Integer.MAX_VALUE;
	char c1=' ';
	for(int i=0;i<=s.length()-1;i++)
	{
		if(min>a[s.charAt(i)])
		{
			min=a[s.charAt(i)];
			c1=s.charAt(i);
		}
	}
	System.out.println(min+"="+c1);
}
}
