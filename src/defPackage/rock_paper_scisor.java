package defPackage;
import java.util.Random;
import java.util.Scanner;

public class rock_paper_scisor {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter 0 for rock ,1 for paper,2 Sciissor");
	int user=sc.nextInt();
	
	Random re=new Random();
	int comp=re.nextInt(3);
	 
	
	if(user==comp)
	{
		System.out.println(" draw");
	}
	else if(user==0 &&comp==2 ||user==1 && comp==0 ||user==2 && comp==1 )  
	{
		System.out.println(" you win");
	}
	else
	{
		System.out.println("computeer win");
	}
}
}
