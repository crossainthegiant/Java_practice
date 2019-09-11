package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/11 21:05
 * @description: 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
几个数相加有键盘控制。
 */
import java.util.Scanner;
public class accumulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要累加的数字：");
        int dig = in.nextInt();
        System.out.println("请输入累加的次数：");
        int n = in.nextInt();
        int sum = 0;
        int t = dig;
        for (int i = 0;i<n;i++){
            sum+=dig;
            dig = dig*10+t;
        }
        System.out.println("累加的结果是："+sum);

    }
}
