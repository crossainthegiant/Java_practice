package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/15 9:46
 * @description: 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查看的数字：");
        int num = in.nextInt();
        if (num<=0||num>=100000){
            System.out.println("输入的数字不合法，请重输：");
            num = in.nextInt();
        }
        int count = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (num>0){
            int digit = num%10;
            array.add(digit);
            num /= 10;
        }
        System.out.println("该数是"+array.size()+"位数");
        System.out.println("它的逆序是：");
        for (int i=0;i<array.size();i++){
            System.out.print(array.get(i));
        }
    }
}
