package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/22 21:52
 * @description: 将其他进制的数转化为十进制
 */

import java.util.Scanner;

public class ConvertTo10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入进制：");
        int n = in.nextInt();
        System.out.println("请输入数字：");
        String a = in.next();
        System.out.println("转化后的数为：" + Integer.parseInt(a, n));
    }
}
