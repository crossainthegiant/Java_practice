package learningJava;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * @Author: qph
 * @Date: 2019/10/10 21:26
 * @description: 用TreeSet对字符串排序，排序规则是字符串长度
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyCompare());
        ts.add("fasgf");
        ts.add("ysfa");
        ts.add("fwyjxcbx");
        ts.add("yruwwqerqw");
        ts.add("qr");

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    static class MyCompare implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.length() - s2.length();
        }
    }
}
