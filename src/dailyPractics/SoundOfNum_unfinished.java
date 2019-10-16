package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/19 11:15
 * @description: 题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下
的是原来第几号的那位。
 */

import java.util.Scanner;

//import java.util.ArrayList;
public class SoundOfNum_unfinished {
    public static void main(String[] args) {
        System.out.println("请输入人数n：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        ArrayList<Integer> array = new ArrayList<Integer>();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 1;
        }
        int num = n;
        int count = 1;
//        while (num > 1) {
//            for (int j = 0; j < n; j++) {
//                while (array[j] != 0) {
//                    if (count == 3) {
//                        array[j] = 0;
//                        count = 1;
//                        num--;
//                    } else {
//                        count++;
//                    }
//                }
//
//            }
//        }
//        for (int k = 0; k < n; k++) {
//            if (array[k] == 1) {
//                System.out.println(k + 1);
//            }
//        }

    }

}
