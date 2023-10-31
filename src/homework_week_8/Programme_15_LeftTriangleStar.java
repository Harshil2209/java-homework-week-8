package homework_week_8;

public class Programme_15_LeftTriangleStar {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //Print spaces
            for (int j = 1; j < 2 * (5 - i); j++) {
                System.out.println(" ");
            }
            //stars
            for (int k = 0; k <= i; k++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
