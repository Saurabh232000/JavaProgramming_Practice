package Exam.cod;

public class near_vowel {
public static void main(String[] args) {
	char c='z';
	char ch=' ';
	for (char i = (char)(c-1); i<='z'; i++)
	{
	  if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
	  {
		  ch=i;
		 break;
	  }
	}
	System.out.println(ch);
}
}

//write a program for n no of stars to be printed on multiple rows such that every new row have more star than the previous one 