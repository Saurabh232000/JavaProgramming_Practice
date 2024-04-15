package Practice_S;

import java.util.Scanner;

public class count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.nextLine();
	int count=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		count++;
	}
	System.out.println(count);
}
}
