package Exam.cod;
import java.util.*;
public class pattern1 {
public static void main(String[] args) {
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
        if (total > 6) {
        	int count=1;
            for (int i = 1; i <= 3; i++) {
                for (int j=1;j<=i;j++) {
                    System.out.print("*");
                    count++;
                }
                System.out.println(" ");
            }
//            System.out.print(count);
            do
            {
            	
            	System.out.print("*");
            	count++;
            }
            while(count==total);
        }
}
}
