package Practice_B;

import java.util.Scanner;

public class albhapet_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     System.out.println("enter char:");
     char c=sc.next().charAt(0);
     if(c>='a'&&c<='z'||c>='A'&&c<='Z')
     {
    	 System.out.println("albhapet");
     }
     else
     {
    	 System.out.println(" not albhapet");
     }
}
}
