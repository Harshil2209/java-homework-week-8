package homework_week_8;

import java.util.Scanner;

/**
 * Java programme to print fibonacci series
 */

public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1 = 0;
        int t2 = 1;
        System.out.println("Enter the number of terms:");
        int n = scanner.nextInt();
        System.out.println("First " + n + "terms of fibonacci series: ");
        for (int i = 1; i <= n ; ++i);
        {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
