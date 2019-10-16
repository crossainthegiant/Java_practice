package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/29 16:18
 * @description: 一元多项式的求导
 */

import java.util.Arrays;
import java.util.Scanner;

public class Derivation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String str = in.nextLine();
            String[] arr = str.split(" ");
            int[] arr1 = new int[20];
            for (int i = 0; i < arr.length; i++) {
                int digit = Integer.parseInt(arr[i]);
                arr1[i] = digit;
            }
            int count = 1;
            for (int j = 0; j < arr1.length; j++) {
                if (count == 1 && arr1[j + 1] != 0) {
                    arr1[j] *= arr1[j + 1];
                    count++;
                } else if (count == 2 && arr1[j] > 0) {
                    arr1[j]--;
                    count = 1;
                }
            }
            System.out.println(Arrays.toString(arr1));

        }
    }
}
