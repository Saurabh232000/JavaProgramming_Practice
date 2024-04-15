package Exam.cod;
import java.util.*;
public class pattern {
public static void main(String[] args)
{
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the total number of stars:");
	        int n = sc.nextInt();
	        if (n < 3) {
	            System.out.println("Minimum number of stars should be 3.");
	        } else {
	            printStarPattern(n);
	        }
	    }
	    public static void printStarPattern(int total) {
	        int starsPerRow = 1; 
	        for (int i = 1; i <= 2; i++) {
	            for (int j = 1; j <= starsPerRow; j++) {
	                System.out.print("*");
	            }
	            starsPerRow = total - starsPerRow; 
	            System.out.println();
	        }
	    }
	}





		        

	        