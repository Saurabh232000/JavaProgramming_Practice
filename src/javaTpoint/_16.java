package javaTpoint;
import java.util.*;
public class _16 {
	static int balance=10000;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enteer choice:");
	String choice=sc.next();
	switch (choice)
	{
	case"balance": System.out.println(_16.balance);
	                break;
	case"withdraw":System.out.println("enter withdraw amout");
	               int withdraw=sc.nextInt();
	               System.out.println("withdraw successfully!!!!!!!");
	               int remaining=balance-withdraw;
	               System.out.println(remaining);
	               break;
	case"deposit":System.out.println("enter deposit amout");
                   int deposit=sc.nextInt();
                   System.out.println("deposit successfully!!!!!!!");
                   int new_remaining=balance+deposit;
                   System.out.println(new_remaining);
                   break;
	case"exit": sc.close();
	}
	}
}
