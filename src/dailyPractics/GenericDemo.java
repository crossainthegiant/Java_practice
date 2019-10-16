package dailyPractics;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * @Author: qph
 * @Date: 2019/10/8 21:36
 * @description: 泛型：JDK1.5版本以后出现新特性，用于解决安全问题，是一个安全机制:
 * 好处：
 * 1.将运行时期出现问题ClassCastException,转移到了便一时期，方便与程序员解决问题，让运行时期问题减少，安全。
    2.避免了强制转换的麻烦。
    * 泛型格式：通过<>来定义要操作的引用数据类型。在使用java提供的对象时
 * */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("asfa1");
        a1.add("asfa2");
        a1.add("asfa3");
        a1.add("asfa4");
        a1.add("asfa5");
        Iterator<String> it = a1.iterator();
        while (it.hasNext()) {
            String s = it.next();

            System.out.println(s + ":" + s.length());


        }

    }
}
