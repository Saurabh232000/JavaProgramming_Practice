package javaTpoint;

public class _48 {
public static void main(String[] args) {
	String s="this is a boy without brain ";
	String[]word=s.split(" ");
	for (int i =word.length-1;i>=0 ;i--) 
	{
	  System.out.println(word[i]+" ="+word[i].length());	
	}
}
}
