package homework_week_8;

public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        int row = 7;

        for (int i=0;i<row;i++){
            for (int j=0;j<row-i-1;j++){
                System.out.println(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.println("* ");
            }
            System.out.println();
        }
        for(int i=0;i<row-1;i++){
            for (int j=0;j<=i;j++){
                System.out.println(" ");
            }
            for (int j=0;j<row-i-1;j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
