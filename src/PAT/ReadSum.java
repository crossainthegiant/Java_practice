package PAT;

/*
 * @Author: qph
 * @Date: 2019/9/26 11:59
 * @description: 读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ReadSum {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("请输入数字：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n > 0) {
            int digit = n % 10;
            array.add(digit);
            n /= 10;
        }
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        ArrayList<String> array1 = new ArrayList<String>();
        while (sum > 0) {
            int digit = sum % 10;
            switch (digit) {
                case 0:
                    array1.add("ling");
                    break;
                case 1:
                    array1.add("yi");
                    break;
                case 2:
                    array1.add("er");
                    break;
                case 3:
                    array1.add("san");
                    break;
                case 4:
                    array1.add("si");
                    break;
                case 5:
                    array1.add("wu");
                    break;
                case 6:
                    array1.add("liu");
                    break;
                case 7:
                    array1.add("qi");
                    break;
                case 8:
                    array1.add("ba");
                    break;
                case 9:
                    array1.add("jiu");
                    break;
                default:
                    break;
            }

            sum /= 10;
        }
        System.out.print(array1.get(array1.size() - 1));
        for (int i = array1.size() - 2; i >= 0; i--) {
            System.out.print(" " + array1.get(i));
        }

    }
}
