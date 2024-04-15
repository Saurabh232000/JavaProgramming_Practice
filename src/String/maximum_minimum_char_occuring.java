package String;
import java.util.*;
public class maximum_minimum_char_occuring {
	public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  System.out.println(" enter your String");
  String name=sc.next();
  int arr[]=new int[150];
  for(int i=0;i<=name.length()-1;i++)
  {
	  arr[name.charAt(i)]=arr[name.charAt(i)]+1;
  }
  int max=0;
  char c=' ';
  for(int i=0;i<=name.length()-1;i++)
  {
	  if(max<arr[name.charAt(i)])
	  {
		  max=arr[name.charAt(i)];
		  c=name.charAt(i);
	  }
  }
  System.out.println(max);
  System.out.println(c);
}
}