package javaTpoint;

public class _38 {
public static void main(String[] args) {
	String s="Saurabh Abhishek";
	int Vcount=0;
	int Ccount=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		char c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			Vcount++;
		}
		else 
		{
			Ccount++;
		}
	}
	System.out.println(Vcount+" ");
	System.out.println(Ccount);
}
}
