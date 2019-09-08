package dailyPractics;
/*
水仙花功能的实现。
水仙花数：仙花数是指一个3位数（100-999之间），其每位数字立方之和等于该3位数本身。
输出所有的水仙花数
 */
public class dailypractice_9_8_2 {
    public static void main(String[] args) {
        for (int i=100;i<=999;i++){
            int h = i/100%10;
            int t = i/10%10;
            int s = i%10;
            if (i == h*h*h+t*t*t+s*s*s){
                System.out.println(i);
            }
        }
    }
}
