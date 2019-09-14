package dailyPractics;

/*
题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 */

public class GuessNumber {
    public static void main(String[] args) {
//        System.out.println(isNumberic(9.0));

        for (int n=0;n<100000;n++){
            double x = Math.sqrt(n + 100);
            double y = Math.sqrt(n + 268);
            if (isNumberic(x)&&isNumberic(y)){
                System.out.println(n);
            }

        }
    }


    public static boolean isNumberic(double x){
        if (x==Math.floor(x)){
            return true;
        }else{
            return false;
        }
    }
}
