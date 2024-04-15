package javaTpoint;

public class _47 {
public static void main(String[] args) {
	String s="this is a boy without brain ";
	String[]word=s.split(" ");
	for (int i = 0; i < word.length; i++) 
	{
	  System.out.println(word[i]+" ="+word[i].length());	
	}
	System.err.println("_________________");
	int max=0;
	String maxword="";
	for (int i = 0; i < word.length; i++) 
	{
		if(word[i].length()>max)
		{
			max=word[i].length();
			maxword=word[i];
		}
	}
	System.out.println(maxword+" "+max);
	int min=Integer.MAX_VALUE;
	String minword="";
	for (int i = 0; i < word.length; i++) 
	{
		if(word[i].length()<min)
		{
			min=word[i].length();
			minword=word[i];
			
		}
	}
	System.out.println(minword+" "+min);
}
}