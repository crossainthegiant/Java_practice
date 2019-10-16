package learningJava;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * @Author: qph
 * @Date: 2019/10/10 20:08
 * @description: TreeSet:可以对Set集合中的元素进行排序
 *                  排序方式：让元素自身具备比较性，继承comparable接口。
 *                           当元素自身不具备比较性时，或者具备的比较性不是需要的，这时候就要让集合自身具备比较性，
 *                           在集合初始化时就有了比较性（构造函数）
 *                           当两者都存在的时候以比较器为主。
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(new Student("asfa", 12));
        ts.add(new Student("asfda", 14));
        ts.add(new Student("asffa", 14));
        ts.add(new Student("asa", 11));
        ts.add(new Student("afa", 19));

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
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
            System.out.println(this.name + "...compare to..." + s.name);
            if (this.age > s.age) {
                return 1;
            } else if (this.age == s.age) {
                return this.name.compareTo(s.name);
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
}
