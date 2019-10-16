package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/10/9 19:21
 * @description: 反射的一些练习
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        employee artist = new employee("james", 1);
        System.out.println(artist.getClass().getName() + "    " + artist.getName());
    }

    static class employee {
        private int id;
        private String name;

        public employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
