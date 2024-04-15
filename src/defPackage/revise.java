package defPackage;
import java.util.*;
public class revise {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
  System.out.println(" enter no:");
  int n=sc.nextInt();
  for(int i=1;i<=n;i++)
  {
	  if(n%i==0)
	  {
		  System.out.println(i);
	  }
  }
}
}
