package learningJava;

import java.util.HashSet;
import java.util.Iterator;

/*
 * @Author: qph
 * @Date: 2019/10/9 21:33
 * @description: 往HashSet中存入指定对象
 * 姓名和年龄相同为同一个人，重复元素
 */
public class HashSetTest {
    public static void sop(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add(new Student("a1", 11));
        hs.add(new Student("a2", 12));
        hs.add(new Student("a3", 13));
        hs.add(new Student("a4", 14));
        hs.add(new Student("a1", 11));

        Iterator it = hs.iterator();

        while (it.hasNext()) {
            Student p = (Student) it.next();
            sop(p.getName() + ":" + p.getAge());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        Student p = (Student) obj;
        return this.name.equals(p.name) && this.age == p.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
