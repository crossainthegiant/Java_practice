package learningJava;

/*
 * @Author: qph
 * @Date: 2019/10/9 21:06
 * @description: set:元素是无序，且元素不可以重复
 *  HashSet: 底层数据结构是哈希表
 *  treeSet：
 * set功能和collection是一样的
 */
//class Demo{
//    public int hashCode(){
//        return 199;
//    }
//}

import java.util.HashSet;
import java.util.Iterator;

class HashSetDemo {
    public static void sop(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
//        Demo d1 = new Demo();
//        Demo d2 = new Demo();
//        sop(d1);
//        sop(d2);
        HashSet hs = new HashSet();
        sop(hs.add("java1"));
        sop(hs.add("java1"));
        hs.add("java2");
        hs.add("java3");
        hs.add("java4");
        hs.add("java5");
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            sop(it.next());
        }
    }

}