package dailyPractics;
/*
用Arraylist方法重写前面的商品库存的程序,添加一个选择功能
 */

import java.util.Scanner;
import java.util.ArrayList;

public class shop_items_usingArraylist {
    public static void main(String[] args) {
        ArrayList<items> array = new ArrayList<items>();
        items it1 = new items("macbookair", 13, 6988.8, 5);
        items it2 = new items("thinkpad", 15.6, 8000, 8);
        items it3 = new items("asusbook2", 12, 4000, 3);
        array.add(it1);
        array.add(it2);
        array.add(it3);
        int totalcount = 0;
        double totalmoney = 0.0;


        System.out.println("请输入需要的功能：1-查看库存；2-添加商品；3-修改库存；4-删除商品；");
        Scanner in = new Scanner(System.in);
        int putin = in.nextInt();
        switch (putin) {
            case 1:
                printShop(array);
                break;
            case 2:
                additem(array);
                break;
            case 3:
                modifyItem(array);
                break;
            case 4:
                deleteItem(array);
                break;
            default:
                System.out.println("输入的内容不合法");
                break;
        }

    }

    public static void printShop(ArrayList<items> array) {
        ;
        System.out.println("------------------------------商城库存清单-----------------------------");
        System.out.println("品牌型号	尺寸	价格	库存数");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getBrand() + "   " + array.get(i).getSize() + "    " + array.get(i).getPrize() + "    " + array.get(i).getRemains());
        }
        System.out.println("-----------------------------------------------------------------------");
//        System.out.println("总库存数："+totalcount);
//        System.out.println("库存商品总金额："+totalmoney);
    }

    public static void additem(ArrayList<items> array) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要添加的品名，尺寸，价格和库存");
        String brand = in.next();
        double size = in.nextDouble();
        double prize = in.nextDouble();
        int remains = in.nextInt();
        items it = new items(brand, size, prize, remains);
        array.add(it);
        printShop(array);

    }

    public static void modifyItem(ArrayList<items> array) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要修改的商品索引号和数量");
        int index = in.nextInt();
        items goods = array.get(index);
        goods.remains = in.nextInt();
        array.set(index, goods);
        printShop(array);
    }

    public static void deleteItem(ArrayList<items> array) {
        System.out.println("请输入要删除的商品的索引号");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        array.remove(index);
        printShop(array);
    }

    static class items {
        private String brand;
        private double size;
        private double prize;
        private int remains;

        public items(String brand, double size, double prize, int remains) {
            this.brand = brand;
            this.size = size;
            this.prize = prize;
            this.remains = remains;
        }

        public String getBrand() {
            return this.brand;
        }

        public double getPrize() {
            return this.prize;
        }

        public double getSize() {
            return this.size;
        }

        public int getRemains() {
            return this.remains;
        }

        public void setRmains(int num) {
            this.remains = num;
        }


    }
}
