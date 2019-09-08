package dailyPractics;
/*
Arraylist 集合的使用
也是引用数据类型
步骤：
    1.导入包 java.util包中
    2.创建引用类型的变量
    数据类型<集合存储的数据类型> 变量名 = new 数据类型<集合存储的数据类型>（）；
    集合存储的数据类型：要将数据存储到集合的容器中
    创造集合引用变量时，必须指定要存储的类型
    集合不存储基本数据类型，只存储引用数据类型，具体的对应关系可以查表
        ArrayList<String> array = new ArrayList<String>();
    3.变量名.方法
 */
import java.util.ArrayList;
public class ArraylistDemo {
    public static void main(String[] args) {
        //创建集合容器，指定存储的数据类型
        //存储字符串
        ArrayList<String> array = new ArrayList<String>();
        //创建集合容器，存储整数
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        //向集合中添加元素 boolean add(object obj) 将obj添加到array的末尾
        array.add("ming");
        array.add("qing");
        array.add("song");
        array.add("tang");
        array.add("yuan");
        array.add("han");
        //get(int index)取出集合中的元素，get方法参数中写入索引
        //size() 返回集合的长度
        //add(int 索引，存储的元素）指定位置插入元素
        //set(int 索引，修改的元素）将指定位置的元素修改为设置值
        //remove(int 索引）删除指定索引上的元素
        //clear()清空所有元素
        int size = array.size();
        System.out.println(size);
        String inf = array.get(3);
        System.out.println(inf);
        
    }
}
