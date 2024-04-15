package String;
import java.util.*;
public class reverse_string {
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println(" enter your name");
 String c= sc.next();
 String rev="";
 for(int i=c.length()-1;i>=0;i--)
 {
	 rev=rev+c.charAt(i);
 }
 System.out.println(rev);
}
}