package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/29 16:50
 * @description: A+B和C的问题
 */

import java.util.Scanner;

public class APlusBAndC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入测试用例个数");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String str = in.nextLine();
            String[] arr = str.split("\\s+");
            int[] arr1 = new int[3];
            for (int j = 0; j < arr.length; j++) {
                if (check(arr[j])) {
                    int digit = Integer.parseInt(arr[j]);
                    arr1[i] = digit;
                }
            }
            if (arr1[0] + arr1[1] > arr1[2]) {
                System.out.println("Case #" + i + ": true");
            } else {
                System.out.println("Case #" + i + ": false");
            }
        }
    }

    public static boolean check(String fstrData) {
        char c = fstrData.charAt(0);
        if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
            return true;
        } else {
            return false;
        }
    }

}
