package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/17 21:09
 * @description: 汉诺塔问题,写出每一步的过程
 */
public class HanoiTower {
    public static void main(String[] args) {
        HanoiTower hanoi = new HanoiTower();
        hanoi.Hanoi(64,'A','B','C');

    }
    public static void move(char from,char to){
        System.out.println(from+"-------->"+to);
    }

    public static void Hanoi(int n,char from,char mid,char to){
        if (n==1){
            move(from,to);
        }else {
            Hanoi(n-1,from,to,mid);
            move(from,to);
            Hanoi(n-1,mid,from,to);
        }
    }


}


