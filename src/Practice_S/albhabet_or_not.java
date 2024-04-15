package Practice_S;

import java.util.Scanner;

public class albhabet_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enteer char:");
	char c=sc.next().charAt(0);
	if(c>='a'&&c<='z'||c>='A'&&c<='Z')
	{
		System.out.println(c+" is albhapet");
	}
	else
	{
		System.out.println(c+" is not albhapet");
	}
}
}
