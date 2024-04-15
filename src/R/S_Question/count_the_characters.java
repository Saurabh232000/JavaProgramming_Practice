package R.S_Question;

import java.util.Scanner;

public class count_the_characters {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.nextLine();
	int count=0;
	char[]c=s.toCharArray();
	for(int i=0;i<=c.length-1;i++)
	{
		if(Character.isDigit(c[i]))
		{
			continue;
		}
		count++;
	}
	System.out.println(count);
}
}
//numbers and symbols should be ignored