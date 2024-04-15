package R.S_Question;

public class Ocurance_of_each_char_in_String {
public static void main(String[] args) {
	String s="saurabh";
	for(int i=0;i<=s.length()-1;i++)
	{
		char c=s.charAt(i);
		int count=0;
		for(int j=0;j<=s.length()-1;j++)
		{
			char c1=s.charAt(j);
			
			if(c==c1&&c!=32)
			{
				count++;
			}
		}
		System.out.println(c+" "+count);
	}
	
}
}
