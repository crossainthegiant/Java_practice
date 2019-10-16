package learningJava;

import java.util.*;

/*
 * @Author: qph
 * @Date: 2019/10/14 15:53
 * @description: 需求：对学生对象的年龄进行升序排序,因为数值是以键值对形式存在的。所以要使用可以排序的Map集合，TreeMap
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new MyCompare());
        tm.put(new Student("lisi", 11), "abc");
        tm.put(new Student("lisi1", 111), "abc1");
        tm.put(new Student("lisi2", 1), "abc2");
        tm.put(new Student("lisi3", 113), "abc3");
        tm.put(new Student("lisi4", 114), "abc4");

//        Set<Student> keySet = tm.keySet();
//        Iterator it = keySet.iterator();
//        while (it.hasNext()) {
//            Student key = (Student) it.next();
//            String value = tm.get(key);
//            System.out.println(key.getName()+" "+key.getAge()+" "+value);
//        }
        Set<Map.Entry<Student, String>> entrySet = tm.entrySet();
        Iterator<Map.Entry<Student, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<Student, String> me = it.next();
            Student stu = me.getKey();
            String attr = me.getValue();
            System.out.println(stu.getName() + stu.getAge() + attr);
        }


    }

    static class Student implements Comparable<Student> {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student s) {
            int num = new Integer(this.age).compareTo(new Integer(s.age));
            if (num == 0) {
                return this.name.compareTo(s.name);
            }
            return num;
        }

        public int hashcode() {
            return name.hashCode() + age * 34;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Student)) throw new ClassCastException("类型不匹配");
            Student s = (Student) obj;
            return this.name.equals(s.name) && this.age == s.age;
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

    static class MyCompare implements Comparator {
        public int compare(Object o1, Object o2) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            return s1.getAge() - s2.getAge();
        }
    }
}
