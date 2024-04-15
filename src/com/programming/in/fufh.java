package com.programming.in;
public class fufh{
public static void main(String[] args) {
	        String inputSentence = "The quick brown fox jumps over the lazy dog"; 
	        if (isPangram(inputSentence)) {
	            System.out.println("The sentence is a pangram.");
	        } else {
	            System.out.println("The sentence is not a pangram.");
	        }
	    }
public static boolean isPangram(String sentence) {
    // Remove spaces and convert to lowercase
    sentence = sentence.replaceAll(" ", "").toLowerCase();
    
    // Create an array to store the occurrence of each letter
    int[] letterCount = new int[26];
    
    // Iterate over each character in the sentence
    for (char c : sentence.toCharArray()) {
        // Check if the character is an alphabetic letter
        if (Character.isLetter(c)) {
            int index = c - 'a';
            letterCount[index]++;
        }
    }
    
    // Check if all letters of the alphabet have occurred at least once
    for (int count : letterCount) {
        if (count == 0) {
            return false;
        }
    }
    
    return true;
	}
}