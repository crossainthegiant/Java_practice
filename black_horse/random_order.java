package black_horse;
import java.util.Scanner;
import java.util.Random;

public class random_order {
    public static void main(String[] args) {
        Scanner putin = new Scanner(System.in);
        System.out.println("请输入学生个数：");
        int n = putin.nextInt();
        String[] student = new String[n];
        for (int i = 0;i<n;i++){
            Scanner stu = new Scanner(System.in);
            student[i] = stu.next();
        }
//        for (int j = 0;j<n;j++){
//            System.out.println(student[j]);
//        }
        Random rn = new Random();
        int index = rn.nextInt(n);
        System.out.println(student[index]);
    }
}
