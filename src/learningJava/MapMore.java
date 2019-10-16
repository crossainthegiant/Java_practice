package learningJava;

import java.util.HashMap;
import java.util.Iterator;

/*
 * @Author: qph
 * @Date: 2019/10/15 16:14
 * @description: Map拓展知识，map集合被使用是因为具备映射关系。
 * "yureban" "01" "zhangsan"
 * "yureban" "02" "lisi"
 * "jiuyeban" "01" "zhangsan1"
 * "jiuyeban" "02" "lisi1"
 * 等等都是一对多映射
 *
 */
public class MapMore {
    public static void main(String[] args) {
        HashMap<String, String> yure = new HashMap<String, String>();
        yure.put("01", "zhangsan");
        yure.put("02", "lisi");

        HashMap<String, String> jiuye = new HashMap<String, String>();
        jiuye.put("01", "zhangsan1");
        jiuye.put("02", "lisi1");

        HashMap<String, HashMap<String, String>> mc = new HashMap<String, HashMap<String, String>>();
        mc.put("yure", yure);
        mc.put("jiuye", jiuye);
        //遍历mc集合，获取所有的教室。
        Iterator<String> it = mc.keySet().iterator();
        while (it.hasNext()) {
            String roomName = it.next();
            HashMap<String, String> room = mc.get(roomName);
            getStudentInfo(room);
        }
//        getStudentInfo(yure);
    }

    public static void getStudentInfo(HashMap<String, String> roomMap) {
        Iterator<String> it = roomMap.keySet().iterator();
        while (it.hasNext()) {
            String id = it.next();
            String name = roomMap.get(id);
            System.out.println(id + "  " + name);
        }
    }
}
