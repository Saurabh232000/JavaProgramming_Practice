package Exam.cod;

public class fh {
	public class EliminateConsecutiveWords {
	    public static void main(String[] args) {
	        String input = "Bangalore Bangalore Bangalore is Bangalore Bangalore my city";
	        String output = eliminateConsecutiveWords(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	    }
	}
	public static String eliminateConsecutiveWords(String input) {
	     StringBuilder result = new StringBuilder();
	      String[] words = input.split(" ");
	        if (words.length > 0) {
	            result.append(words[0]);
	            for (int i = 1; i < words.length; i++) {
	                if (!words[i].equals(words[i - 1])) {
	                    result.append(" ").append(words[i]);
	                }
	            }
	        }
	        return result.toString();
	    }
}


