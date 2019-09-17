package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/17 20:51
 * @description: 获取当前时间并将其格式化输出
 */
import java.util.Date;
import java.text.SimpleDateFormat;
public class GetTime {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat fm = new SimpleDateFormat();
        fm.applyPattern("yyyy-MM-dd HH:mm:ss a");
        System.out.println("现在的时间是"+fm.format(date));
    }
}
