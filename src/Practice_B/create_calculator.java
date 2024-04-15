package Practice_B;

import java.util.Scanner;

public class create_calculator {
public static void main(String[] args) {
	String user;
	do {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no1:");
	int a=sc.nextInt();
	System.out.println("enter no2:");
	int b=sc.nextInt();
	System.out.println("enter operation: + ,-, *, %, /");
	String choice=sc.next();
	int result;
	switch(choice)
	      {
	case "+": result=a+b;
		      System.out.println(result);
		      break;
	case "-": result=a-b;
              System.out.println(result);
              break;
	case "*": result=a+b;
              System.out.println(result);
               break;
	case "%": result=a+b;
               System.out.println(result);
               break;
	case "/": result=a+b;
              System.out.println(result);
               break;
      default:System.out.println("invalid data");
       break;
	      }
	System.out.println(" press y for next");
	 user=sc.next();
	}
	while(user!="y"&&user!="Y");
}
}
