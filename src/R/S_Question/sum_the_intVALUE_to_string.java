package R.S_Question;
import java.lang.*;
public class sum_the_intVALUE_to_string {

public static void main(String[] args) {
	String s="for45rdg1lfmf825t";
	int sum=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch=s.charAt(i);
		if(Character.isDigit(ch))
		{
		sum=sum+ch-48;	
		}
	}
	System.out.println(sum);
}
}
