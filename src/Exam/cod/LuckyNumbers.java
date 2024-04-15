package Exam.cod;

import java.math.BigInteger;
import java.util.Scanner;

public class LuckyNumbers {
    public static String findLuckyNumber(int X) {
        BigInteger eight = new BigInteger("8");
        BigInteger six = new BigInteger("6");
        BigInteger num = eight;
        BigInteger modX = num.mod(BigInteger.valueOf(X));

        int length = 1;

        while (length <= 200) {
            if (modX.equals(BigInteger.ZERO)) {
                return num.toString();
            }

            num = num.multiply(BigInteger.TEN).add(six);
            modX = num.mod(BigInteger.valueOf(X));
            length++;
        }

        return "-1";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int X = scanner.nextInt(); // Integer X for this test case
            String result = findLuckyNumber(X);
            System.out.println(result);
        }
    }
}
