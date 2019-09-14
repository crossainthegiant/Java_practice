package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/14 19:41
 * @description: 题目：利用递归方法求5!(这里递归很久没用了，回去查了一下之前C语言的递归实现）
 */
public class recursion5 {
    public static void main(String[] args) {
        int x=5;
        int t = Fac(x);
        System.out.println(x+"的阶乘为"+t);

    }

    public static int Fac(int x){
        if (x>1){
            return x*Fac(x-1);
        }else {
            return 1;
        }
    }
}
