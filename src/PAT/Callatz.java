package PAT;

/*
 * @Author: qph
 * @Date: 2019/9/23 18:47
 * @description: PAT的卡特兹猜想
 */

import java.util.Scanner;

public class Callatz {
    public static void main(String[] args) {
        System.out.println("请输入一个不大于1000的正整数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (3 * n + 1) / 2;
            }
            count++;
        }
        System.out.println("经过的变换次数为：" + count);
    }
}
