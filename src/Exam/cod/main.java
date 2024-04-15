package Exam.cod;

import java.util.Scanner;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the number of test cases

        for (int t = 0; t < numTestCases; t++) {
            String stringA = scanner.nextLine().trim();
            String stringB = scanner.nextLine().trim();
            int k = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after k

            boolean possible = canTransform(stringA, stringB, k);
            System.out.println(possible ? "Yes" : "No");
        }

        scanner.close();
    }

    public static boolean canTransform(String a, String b, int k) {
        int len = a.length();
        for (int i = 0; i < len; i++) {
            int diff = Math.abs(a.charAt(i) - b.charAt(i));
            // Calculate the minimum number of operations required to transform character a to character b
            int minOperations = Math.min(diff, 26 - diff);
            k -= minOperations;
            if (k < 0) {
                return false; // It's not possible to transform in k operations
            }
        }
        return k % 2 == 0; // Check if remaining operations are even
    }
}
