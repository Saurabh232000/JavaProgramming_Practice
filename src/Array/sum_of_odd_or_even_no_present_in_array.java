package Array;

public class sum_of_odd_or_even_no_present_in_array {
public static void main(String[] args) {
	int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    int num = 0;
    int num1 = 0;
    int count=0;
    
    for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 0) {
            num += a[i];
            count++;
            System.out.print(a[i] + " + ");
            System.out.print(count);
        }
        
        else {
            num1 += a[i];
            System.err.print(a[i] + " + ");
        }
    }
    
    System.out.println("\nSum of even numbers: " + num);
    System.out.println("Sum of odd numbers: " + num1);
}
}
