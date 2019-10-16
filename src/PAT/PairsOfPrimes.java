package PAT;

/*
 * @Author: qph
 * @Date: 2019/9/28 17:41
 * @description: 素数对猜想:在一行中输出不超过N的满足猜想的素数对的个数。
 */

import java.util.Scanner;
import java.util.ArrayList;


public class PairsOfPrimes {

    public static void main(String[] args) {
        System.out.println("请输入一个数字n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> plist = new ArrayList<Integer>();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                plist.add(i);
            }
        }
        for (int j = 0; j < plist.size() - 1; j++) {
            if (plist.get(j + 1) - plist.get(j) == 2) {
                count++;
            }
        }
        System.out.println("不超过100000的n内所含素数对个数为：" + count);
    }

    public static boolean isPrime(int x) {
        int flag = 1;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = 0;
            }
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }
}
