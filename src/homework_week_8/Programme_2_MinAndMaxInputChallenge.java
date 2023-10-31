package homework_week_8;

import java.util.Scanner;

/**
 * Reads numbers from the console entered by the user and prints the minimum and maximum number entered.
 * Before the user enters the number, it prints the message "Enter number:".
 * If the user enters an invalid number, it breaks out of the loop and prints the minimum and maximum number.
 */

public class Programme_2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true){
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            }else {
                break;
            }
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number enetered: " + max);
    }
}
