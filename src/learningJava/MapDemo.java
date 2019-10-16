package learningJava;

import java.util.*;

/*
 * @Author: qph
 * @Date: 2019/10/11 19:48
 * @description: learningJava
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        //添加元素 如果出现添加时相同的键，那么后添加的至会覆盖原有值，put方法会返回被覆盖的值
        map.put("01", "zhangsan");
        map.put("02", "zhangsan1");
        map.put("03", "zhangsan2");
        map.put("04", "zhangsan3");
        map.put("05", "zhangsan4");

        System.out.println(map.containsKey("022"));
        System.out.println(map.remove("02"));
        System.out.println(map.get("01"));
        map.put(null, "aha");
        System.out.println(map.get(null));
        //可以通过get方法的返回值来判断一个键是否存在

        //获取map集合中所有的值
        Collection<String> coll = map.values();
        System.out.println(coll);
        //keySet将map中所有的键存入到set集合，因为set具备迭代器，可以用迭代方式取出所有的键，再根据get方法获取每一个键对应的值
        Set<String> keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            String value = map.get(key);
            System.out.println(key + ">>>>>>>" + value);

        }


    }
}
