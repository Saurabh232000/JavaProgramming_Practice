package Practice_S;

import java.util.Scanner;

public class count_no_of_vowels {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String s=sc.nextLine();
	char[] c=s.toCharArray();
	int count=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
		{
			count=count+1;
		}
	}
	System.out.println(count);
}
}