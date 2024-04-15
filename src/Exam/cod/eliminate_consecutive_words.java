//write a program to eliminate consecutive words from a given string
// input=Bangalore Bangalore Bangalore is Bangalore Bangalore my city
//output=Bangalore is Bangalore my city
package Exam.cod;
import java.util.Scanner;
public class eliminate_consecutive_words {
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     String input = "Bangalore Bangalore Bangalore is is Bangalore Bangalore";
	     String[] words = input.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i <= words.length-1; i++) {
	            if (i == 0 || !words[i].equals(words[i - 1])) {
	                result.append(words[i]).append(" ");
	            }
	        }

	        String out = result.toString().trim();
	        System.out.println(out);;
	}
}

