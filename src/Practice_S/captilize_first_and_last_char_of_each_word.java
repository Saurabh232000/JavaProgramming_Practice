package Practice_S;

import java.util.Scanner;

public class captilize_first_and_last_char_of_each_word {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String s= "this is a boy without mind";                    //sc.nextLine();
	String[]word=s.split(" ");
	String s2="";
	for (int i = 0; i <= word.length-1; i++) 
	{
	  	for(int j=0;j<=word[i].length()-1;j++)
	  	{
	  		if(j==0 || j==word[i].length()-1)
	  		{
	  			s2=s2+String.valueOf(word[i].charAt(j)).toUpperCase();
	  		}
	  		else
	  		{
	  			s2=s2+String.valueOf(word[i].charAt(j));
	  		}
	  	}
	  	s2=s2+" ";
	}
	System.out.println(s2);
}
}