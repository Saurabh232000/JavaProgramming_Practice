import java.util.*;
public class Frequency_Of_Char {
   public static void main(String[] args) {
//	   Scanner sc;
//	   String user;
//	   do{
//	    sc=new Scanner(System.in);
//	   System.out.println("enter no1:");
//	   int num1=sc.nextInt();
//	   System.out.println("enter no2:");
//	   int num2=sc.nextInt();
//	   System.out.println("select choice:+,-,*,%,/");
//	   String choice=sc.next();
//	   switch(choice)
//	          {
//	   case"+":System.out.println(num1+num2);
//	           break;
//	   case"-":System.out.println(num1-num2);
//	           break;
//	   case"*":System.out.println(num1*num2);
//	           break;
//	   case"%":System.out.println(num1%num2);
//	           break;
//	   case"/":System.out.println(num1/num2);
//	           break;
//	   default:System.out.println("invalid");
//	          }
//	      user=sc.next();
//	   }
//	   while(user.equals("y"));
	   for (int i=1; i <=5; i++)
	{
		for (int j=1; j<=5; j++) 
		{
		 if((i==j)||(i+j==5-1))
		       {
			 System.out.print("*");
		        }
		 else
		     {
			 System.out.print(" ");
		     }
		}
		System.out.println();
	}
}
}