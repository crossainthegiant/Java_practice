package learningJava;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * @Author: qph
 * @Date: 2019/10/10 20:50
 * @description: 当元素自身不具备比较性时或者具备的比较性不是需要的，这时需要让容器自身具备比较性。
 * 定义了比较器，将比较器对象作为参数传递给TreeSet集合的构造函数
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyCompare());

        ts.add(new TreeSetDemo.Student("asfa", 12));
        ts.add(new TreeSetDemo.Student("asfda", 14));
        ts.add(new TreeSetDemo.Student("asffa", 14));
        ts.add(new TreeSetDemo.Student("asa", 11));
        ts.add(new TreeSetDemo.Student("afa", 19));

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            TreeSetDemo.Student s = (TreeSetDemo.Student) it.next();
            System.out.println(s.getName() + ":" + s.getAge());
        }

    }

    static class Student implements Comparable {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Object obj) {
            if (!(obj instanceof Student)) {
                throw new RuntimeException("不是学生对象");
            }
            Student s = (Student) obj;
            System.out.println(this.name + "...compare to..." + s.getName());
            if (this.age > s.getAge()) {
                return 1;
            } else if (this.age == s.getAge()) {
                return this.name.compareTo(s.getName());
            } else {
                return -1;
            }
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
            return s1.getName().compareTo(s2.getName());
        }
    }

}

