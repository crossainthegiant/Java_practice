package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/18 20:49
 * @description: 输入行数n和字符串c，输出n行元素为c的三角形
 */

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入行数：");
        int n = in.nextInt();
        System.out.println("请输入字符：");
        String c = in.next();
        formTriangle(n, c);
    }

    public static void formTriangle(int n, String c) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }
}
