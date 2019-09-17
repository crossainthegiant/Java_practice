package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/17 20:29
 * @description: 查找输入数组中的重复元素
 */
import java.util.Scanner;
public class FindRepeatingElement {
    public static void main(String[] args) {
        int[] intarray = new int[10];
        System.out.println("请输入数组的各个元素：");
        Scanner in = new Scanner(System.in);
        for (int i = 0;i<intarray.length;i++){
            intarray[i] = in.nextInt();
        }
        findRepeating(intarray);
    }

    public static void findRepeating(int[] array){
        int count=0;
        for (int i=0;i<array.length;i++){
            count=0;
            for (int j=i+1;j<array.length;j++){
                if (array[i]==array[j]){
                    count++;
                }
            }
            if (count==1){
                System.out.println("重复元素为："+array[i]);
            }
        }
    }
}
