package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/16 19:47
 * @description: 两个字符串连接程序
 */
import java.util.Scanner;
public class StringCat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String str1 = in.nextLine();
        System.out.println("请输入第二个字符串：");
        String str2 = in.nextLine();
        String result = concats(str1,str2);
        System.out.println(result);
        }


        public static String concats(String str1,String str2){
            return str1.concat(str2);
        }

    }

