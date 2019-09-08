package dailyPractics;

/**
 * Created by cross on 2019/9/3.
 */
public class items_in_shop {
    public static void main(String[] args) {
        int totalcount = 0;
        double totalmoney = 0.0;
        items macbook = new items("macbookair",13,6988.8,5);
        items thinkpad = new items("thinkpad",15.6,8000,8);
        items asusbook = new items("asusbook2",12,4000,3);
        totalcount = macbook.count+thinkpad.count+asusbook.count;
        totalmoney = macbook.count*macbook.prize+thinkpad.count*thinkpad.prize+asusbook.count*asusbook.prize;
        System.out.println("------------------------------商城库存清单-----------------------------");
        System.out.println("品牌型号	尺寸	价格	库存数");
        System.out.println(macbook.brand+"  "+macbook.size+"    "+macbook.prize+"   "+macbook.count);
        System.out.println(thinkpad.brand+"  "+thinkpad.size+"    "+thinkpad.prize+"   "+thinkpad.count);
        System.out.println(asusbook.brand+"  "+asusbook.size+"    "+asusbook.prize+"   "+asusbook.count);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("总库存数："+totalcount);
        System.out.println("库存商品总金额："+totalmoney);
    }
}


class items {
    public String brand;
    public double size;
    public double prize;
    public int count;


    public items(String brand, double size, double prize, int count){
        this.brand = brand;
        this.size = size;
        this.prize = prize;
        this.count = count;
    }
}
