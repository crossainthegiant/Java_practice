package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/12 11:51
 * @description: 输入一句话，统计出这句话中数字、字母、空格和其他字符的个数
 */

import java.util.Scanner;

public class variousCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要检测的句子：");
        String str = in.nextLine();
        int digit = 0;
        int space = 0;
        int letter = 0;
        int others = 0;
        char[] sen = str.toCharArray();
        for (int i = 0; i < sen.length; i++) {
            if (sen[i] > '0' && sen[i] < '9') {
                digit++;
            } else if (sen[i] == ' ') {
                space++;
            } else if ((sen[i] > 'a' && sen[i] < 'z') || (sen[i] > 'A' && sen[i] < 'Z')) {
                letter++;
            } else {
                others++;
            }
        }
        System.out.println("数字：" + digit);
        System.out.println("字母：" + letter);
        System.out.println("空格：" + space);
        System.out.println("其他：" + others);


    }
}
