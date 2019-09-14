package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/14 18:35
 * @description: 题目：输入某年某月某日，判断这一天是这一年的第几天？
 */

import java.util.Scanner;

public class ShowDate {
    public static void main(String[] args) {
        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = in.nextInt();
        System.out.println("请输入月份：");
        int month = in.nextInt();
        System.out.println("请输入日子");
        int date = in.nextInt();
        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days += month_days[i];
        }
        days += date;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            days++;
        }
        System.out.println("这是全年的第" + days + "天");


    }
}
