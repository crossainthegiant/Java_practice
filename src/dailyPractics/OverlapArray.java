package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/19 12:13
 * @description: 求两个数组的交集
 */

import java.util.ArrayList;
import java.util.Scanner;

public class OverlapArray {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<String>();
        ArrayList<String> array2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个数组的长度和元素：");
        int n1 = in.nextInt();
        for (int i = 0; i < n1; i++) {
            String s = in.next();
            array1.add(s);
        }
        System.out.println("请输入第二个数组的长度和元素：");
        int n2 = in.nextInt();
        for (int i = 0; i < n2; i++) {
            String s = in.next();
            array2.add(s);
        }
        array1.retainAll(array2);
        if (array1.isEmpty()) {
            System.out.println("无交集");
        } else {
            System.out.println("包含");
        }
        System.out.println(array1);


    }
}
