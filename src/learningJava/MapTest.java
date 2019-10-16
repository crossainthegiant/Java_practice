package learningJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * @Author: qph
 * @Date: 2019/10/13 16:35
 * @description: 每一个学生都有对应的归属地。
 * 学生Student,地址String
 * 学生属性：姓名年龄
 * 注意：姓名和年龄相同的视为同一个学生，要保证学生的唯一性
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Student, String> stu = new HashMap<Student, String>();

        stu.put(new Student("zhangsan", 1), "abc");
        stu.put(new Student("zhangsan2", 2), "abc2");
        stu.put(new Student("zhangsan3", 3), "abc3");
        stu.put(new Student("zhangsan4", 4), "abc4");
        stu.put(new Student("zhangsan", 1), "abc");

        Set<Map.Entry<Student, String>> entryset = stu.entrySet();
        Iterator<Map.Entry<Student, String>> it = entryset.iterator();

        while (it.hasNext()) {
            Map.Entry<Student, String> me = it.next();
            Student key = me.getKey();
            String value = me.getValue();

            System.out.println(key.getName() + "  " + key.getAge() + ">>>>>>>" + value);

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
}
