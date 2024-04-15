package Exam.cod;

import java.util.Scanner;

public class BessieMelody {
    public static int minStepsToPerfectMelody(int N, int[] melody) {
        int steps = 0;

        for (int i = 0; i < N; i++) {
            if (melody[i] <= 0) {
                steps += Math.abs(melody[i]); // Update the steps with the absolute value
                melody[i] = 1;  // Update the note to 1 to make it strictly positive
            }
        }

        int sum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            sum += melody[i];
            minSum = Math.min(minSum, sum);

            if (sum < 0) {
                steps += Math.abs(sum); // Adjust the steps for the subsequence with negative sum
                minSum = Math.min(0, minSum); // Ensure the subsequence starts with a minimum of 0
            }
        }

        if (minSum < 1)
            steps += 1 - minSum; // Adjust the steps to make the subsequence start with 1

        return steps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] melody = new int[N];

        for (int i = 0; i < N; i++) {
            melody[i] = scanner.nextInt();
        }

        int result = minStepsToPerfectMelody(N, melody);
        System.out.println(result);
    }
}
