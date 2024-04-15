package defPackage;
import java.util.*;
public class tst {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter your salary:");
		float salary =sc.nextFloat();
		float tax=0;
		if(salary<=250000)
		{
			System.out.println(salary);
		}
		if(salary>250000 || salary <=500000)
		{
			tax=(salary*0.05f);
			System.out.println(tax);
			salary=salary-tax;
			System.out.println(" remaining salary"+salary);
		}
		if(salary>500000 || salary <=100000)
		{
			tax=(salary*0.20f);
			System.out.println(tax);
			salary=salary-tax;
			System.out.println(" remaining salary"+salary);
		}
		if(salary>1000000)
		{
		tax=salary*0.30f;
		System.out.println(tax);
		salary=salary-tax;
		System.out.println(" remaining salary"+salary);
		}
	}
}
