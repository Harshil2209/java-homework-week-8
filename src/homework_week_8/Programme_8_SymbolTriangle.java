package homework_week_8;

/**
 * Display a right angle triangle of "@" using nested for loop
 */

public class Programme_8_SymbolTriangle {

    public static void rightAngleTriangle(int n){
        int a,b;
        for (a = 0; a < n; a++){
            for (b = 0; b <= n; b++){ //for loop to go until row 5 whilst adding the column by 1
                System.out.println("@ ");
            }
            System.out.println();
        }
    }

    //main method to rightAngleTriangle
    public static void main(String[] args){
        int c = 5;
        rightAngleTriangle(c);
    }
}
