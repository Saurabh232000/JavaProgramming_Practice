package R.S_Question;

public class count_lc_uc_sc_ {
public static void main(String[] args) {
	String s="SA@693301gmail.com";
	int count=0;
	int count1=0;
	int count2=0;
	int count3=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		char c=s.charAt(i);
		if(c>=97&&c<=122)
		{
			count++;
		}
		if(c>=65&&c<=96)
		{
			count1++;
		}
		if(c>='0'&&c<='9')
		{
			count2++;
		}
		else if(c==46||c==64)
		{
			count3++;
		}
	}
	System.out.println(count+" "+count1+" "+count2+" "+count3);
}
}
