package dailyPractics;
/*
随机点名器的Arraylist实现(包含学生的姓名和年龄）
 */
import java.util.ArrayList;

public class Callname {
    public static void main(String[] args) {
        ArrayList<student> array = new ArrayList<student>();
        addArray(array);
        printArraylist(array);
        selectRandom(array);
    }


    public static void addArray(ArrayList<student> array) {
        student st1 = new student("zhangsan", 19);
        student st2 = new student("lisi", 29);
        student st3 = new student("wangwu", 14);
        student st4 = new student("renwu", 34);
        student st5 = new student("jianghe", 23);

        array.add(st1);
        array.add(st2);
        array.add(st3);
        array.add(st4);
        array.add(st5);
    }

    public static void printArraylist(ArrayList<student> array) {
        for (int i = 0; i < array.size(); i++) {
            student s = array.get(i);
            System.out.println(s.getName() + "    " + s.getAge());
        }
    }

    public static void selectRandom(ArrayList<student> array) {
        int n = array.size();
        int index = (int) (Math.random() * n);
        student s = array.get(index);
        System.out.println(s.getName() + "    " + s.getAge());

    }

    static class student {
        private String name;
        private int age;

        public student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}