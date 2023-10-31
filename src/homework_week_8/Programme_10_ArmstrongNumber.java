package homework_week_8;

public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        int num =153, result=0, rem;//rem=remainder
        int temp=num;

        while(num>0) {
            rem = num % 10; //153%10=3 ,15%10=5 , 1%10 =1
            num = num / 10; //153/10=15 ,15/10=1 , 1/10=0
            result = result + (rem * rem * rem);
            //0+(3*3*3)=27, 27+(5*5*5)=152, 152+(1*1*1)=153
        }
        if (result==temp){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not a Armstrong number");
        }
    }
}
