package PAT;

/*
 * @Author: qph
 * @Date: 2019/9/27 17:34
 * @description: 换个格式输出整数:让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示不为零的个位数字 n（<10），换个格式来输出任一个不超过 3 位的正整数。例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PrintInt {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("请输入一个整数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            array.add(digit);
        }
        switch (array.size()) {
            case 3:
                for (int i = 0; i < array.get(2); i++) {
                    System.out.print('B');
                }
                for (int i = 0; i < array.get(1); i++) {
                    System.out.print('S');
                }
                if (array.get(0) == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
                break;
            case 2:
                for (int i = 0; i < array.get(1); i++) {
                    System.out.print('S');
                }
                if (array.get(0) == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
                break;
            case 1:
                if (array.get(0) == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
                break;
            default:
                break;
        }

    }
}
