package homework_week_8;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number
 * The method needs to find the first and last digit of parameter number passed to the method ,
 * using a loop and return the sum of the first and the last digit of that number
 * If the number is negative then the method needs to return -1 to indicate an invalid value
 */

public class Programme_7_FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit (252));

    }//end of main method

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }
        int lastDigit = number % 10;

        while (number >= 10){
            number /= 10;
        }
        return (number + lastDigit);
    }//end of sumFirstAndLastDigit method
}//end of main class
