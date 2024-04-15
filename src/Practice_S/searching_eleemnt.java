package Practice_S;

import java.util.Scanner;

public class searching_eleemnt {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.nextLine();
	char []c=s.toCharArray();
	System.out.println("enter searching element");
	char search=sc.next().charAt(0);
	for(int i=0;i<=s.length()-1;i++)
	{
		if(c[i]==search)
		{
			System.out.println(search+" "+i);
		}
	}
}
}
