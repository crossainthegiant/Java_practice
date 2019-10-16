package learningJava;

import java.util.*;

/*
 * @Author: qph
 * @Date: 2019/10/14 16:28
 * @description: 获取字符串中字母出现的次数，希望打印结果：a(1)c(2)......
 * 通过结果发现每一个字母都有自己的次数，映射关系，可选择Map集合
 * 因为Map集合中存放的就是映射关系
 * 本题：第一次用a作为键去找集合，没有a这个键所以也没有对应次数，如果返回Null将字母和1存入集合
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        System.out.println("请输入一行字符串：");
        Scanner in = new Scanner(System.in);
        char[] cha = in.next().toCharArray();
        for (int i = 0; i < cha.length; i++) {
            Integer value = map.get(cha[i]);
            if (value == null) {
                map.put(cha[i], 1);
            } else {
                value = value + 1;
                map.put(cha[i], value);
            }
        }
//        System.out.println(map);
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();

        while (it.hasNext()) {
            Map.Entry<Character, Integer> me = it.next();
            Character ch = me.getKey();
            Integer value = me.getValue();
            System.out.print(ch + "(" + value + ")");
        }


    }
}
