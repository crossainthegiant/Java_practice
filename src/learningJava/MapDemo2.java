package learningJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * @Author: qph
 * @Date: 2019/10/12 18:58
 * @description: entrySet()返回此映射中包含映射关系的set视图,而这个关系的数据类型就是Map.entry
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("01", "lisi1");
        map.put("02", "lisi2");
        map.put("03", "lisi3");
        map.put("04", "lisi4");
        map.put("05", "lisi5");

//        System.out.println(map.entrySet());
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //Map.Entry获取的是关系，是一种类型。

        /*
         * Map.Entry 其实Entry也是一个借口，他是Map接口中的一个内部接口
         * */
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key);
            System.out.println(value);
        }

    }
}
