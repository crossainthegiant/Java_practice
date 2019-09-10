package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/10 12:44
 * @description: 数组的各种用法，遍历、逆序、排序、查找
 */

import java.util.Scanner;

public class array_operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array_test = new int[10];
        for (int i = 0; i < 10; i++) {
            array_test[i] = in.nextInt();
        }
        print_array(array_test);//输出数列
        reverse_array(array_test);//数列逆序
        choose_sort(array_test);//选择排序
        buble_sort(array_test);//冒泡排序
        search_array_inorder(array_test);//折半查找有序数列

    }

    public static void print_array(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ",");
            }
        }

    }

    public static void reverse_array(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int t;
            t = array[i];
            array[i] = array[j];
            array[j] = t;
        }
        print_array(array);
    }

    public static void choose_sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            int t = array[i];
            array[i] = array[k];
            array[k] = t;
        }
        print_array(array);
    }

    public static void buble_sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;

                }
            }
        }
        print_array(array);
    }

    public static void search_array_inorder(int[] array) {
        buble_sort(array);//查找前先让数列有序
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查找的项内容");
        int n = in.nextInt();
        int begin = 0;
        int after = array.length - 1;
        int mid = 0;

        while (begin < after) {
            mid = (begin + after) / 2;
            if (n > array[mid]) {
                begin = mid + 1;
            } else if (n < array[mid]) {
                after = mid - 1;
            } else {
                System.out.println(mid);
            }
        }
        System.out.println("没找到指定元素");
    }
}
