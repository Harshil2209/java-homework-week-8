package homework_week_8;

/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * If parameter is >=10 the method should process the number and return sum of all digits, otherwise
 * return -1 to indicate an invalid value.
 * <p>
 * The numbers from 0-9 have 1 digit  we don't want to process them, also we don't want to process
 * negative numbers,so also return -1 for negative numbers.
 * <p>
 * For example calling the method sumDigits(125) should return 8 since 1+2+5=8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 */

public class Programme_4_DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-6));
        System.out.println(sumDigits(12345));
    }

    private static int sumDigits(int number) { // With Return With Parameter Method

        if (number < 10) { // Will return -1 if Number is less than 10
            return -1;
        }

        int sum = 0; // Integer declaration
        while (number > 0) { // if multiple numbers are entered they all will be added
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;

}

}


