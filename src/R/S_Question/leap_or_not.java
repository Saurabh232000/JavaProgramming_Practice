package R.S_Question;

public class leap_or_not {
public static void main(String[] args) {
	int n=2000;
	if((n%4==0&&n%100!=0)||(n%400==0))
	{
		System.out.println("leap year");
	}
	else
	{
		System.out.println("not a leap year");
	}
}
}
