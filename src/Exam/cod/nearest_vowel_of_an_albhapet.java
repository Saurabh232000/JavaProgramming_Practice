package Exam.cod;
import java.io.*;
import java.util.*;
public class nearest_vowel_of_an_albhapet {
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	         String s = sc.nextLine();
	        String vowels = "aeiouAEIOU";
	        for (char c : s.toCharArray())
	        {
	            if (vowels.indexOf(c) != -1)
	            {
	                System.out.println("Nearest vowel to '" + c + "' is '" + c + "'");
	            } 
	            else {
	                char nearestVow = findNearestVowel(c, vowels);
	                System.out.println("Nearest vowel to '" + c + "' is '" + nearestVow + "'");
	                }
	        }
	    }
	    public static char findNearestVowel(char c, String vowels) 
	    {
	        char ch = ' ';
	        int min = Integer.MAX_VALUE;

	        for (char vowel : vowels.toCharArray())
	        {
	            int current = Math.abs(c - vowel);
	            if (current < min)
	            {
	                min = current;
	                ch = vowel;
	            }
	        }
	        return ch;
	    }
	}


