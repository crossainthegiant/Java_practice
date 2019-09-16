package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/12 8:44
 * @description: 一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完
数。     (在这个题上走了很多弯路，总想着把所有因子都存到数组里再统一计算，结果做了很久都出错，9.16又想了一下，用简单方法很快做出来了）
 */

import java.util.ArrayList;

public class perfectNumber {
    public static void main(String[] args) {
        for (int i=1;i<=1000;i++){
            int sum = 0;
            for (int j=1;j<=i-1;j++){
                if (i%j==0){
                    sum+=j;
                }
            }
            if (i==sum){
                System.out.println(i);
            }
        }
//        ArrayList<Integer> array = new ArrayList<Integer>();
//        int k=2;
//        array.add(1);
//        for (int i=1;i<=1000;i++){
//            int t = i;
//            int sum = 0;
//            if (i==1){
//                System.out.println(1);
//            }else {
//            while (k<=i) {
//                if (i % k == 0) {
//                    array.add(k);
//                    i /= k;
//                } else {
//                    k++;
//                }
//            }
//            for (int j = 0;j<array.size();j++){
//                sum+=array.get(j);
//            }
//            if (sum==t){
//                System.out.println(t);
//            }}
//        }
    }
}
