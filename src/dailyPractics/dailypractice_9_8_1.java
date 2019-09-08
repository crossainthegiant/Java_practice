package dailyPractics;
/*
练习循环的使用，求1到100中所有奇数的和
 */
public class dailypractice_9_8_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i<=100;i++){
            if (i%2==1){
                sum+=i;
            }
        }
        System.out.println("sum="+sum);
    }
}
