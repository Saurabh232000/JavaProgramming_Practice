package Exam.cod;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, length - i - 1);
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        for (int i = 0; i < rows; i++) {
            String line = scanner.nextLine();
            String[] elements = line.split("\\s+");
            int sum = 0;

            for (int j = 0; j < cols; j++) {
                sum += binaryToDecimal(elements[j]);
            }

            System.out.println(sum);
        }
    }
}
