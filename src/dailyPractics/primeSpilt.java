package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/11 17:02
 * @description: 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。 
 */
import java.util.Scanner;
public class primeSpilt {
    public static void main(String[] args) {
        System.out.print("请输入要分解的数字：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        new prime_spilt(n);
        /*
        匿名对象：我们只有"new 类名称();"这部分的话，
         那就是只是在堆中开辟了一个空间来保存对象信息，没有栈去指向它。也就是这个空间是没有名字的。
        所以，没有栈指向的对象就叫做匿名对象。
        由于没有引用变量指向匿名对象，所以只能使用一次!然后就会成为垃圾对象等待被回收，
        */
    }

    static class prime_spilt{
        int k=2;
        public prime_spilt(int x){
            if (x<=1){
                System.out.println(x+"是无效分解数");
            }
            else if (x==2){
                System.out.println("输入的数字是2");
            }else{
                System.out.print(x+"分解后的因数为"+"1");
                while(k<=x){
                    if (x%k==0){
                        System.out.print("*"+k);
                        x/=k;
                    }else {
                        k++;
                    }

                }
            }
        }
    }
}
