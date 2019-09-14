package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/14 19:36
 * @description: 题目：求1+2!+3!+...+20!的和
 */
public class FactorialSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<=20;i++){
            int t=1;
            for (int j=1;j<=i;j++){
                t*=j;
            }
            sum+=t;
        }
        System.out.println(sum);
    }
}
