package homework_week_8;

/**
 * Write a method called isPalindrome with one int parameter called number
 * the method needs to return a boolean
 * it should return true if the number is a palindrome number
 * otherwise it should return false
 */
public class Programme_5_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int originalNumber = number;

        while (number !=0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;

        }
        return originalNumber == reverse;
    }
}
