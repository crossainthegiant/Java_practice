package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/11 16:01
 * @description: 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
import java.util.Scanner;
//本质上就是个fibonacci数列
public class countRabbit {
    public static void main(String[] args) {
        System.out.println("请输入截止的月份：");
        Scanner in = new Scanner(System.in);
        int mon = in.nextInt();
        int[] array = new int[mon];
        array[0] = array[1] = 1;
        for (int i = 2;i<mon;i++){
            array[i] = array[i-1]+array[i-2];
        }
        for (int i=0;i<mon;i++){
            System.out.println("第"+i+"月有:兔子"+array[i]+"对，即"+array[i]*2+"只");
        }

    }
}
