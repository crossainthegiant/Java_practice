package book.concurrency;

import java.util.concurrent.atomic.AtomicReference;

/*
 * @Author: qph
 * @Date: 2019/10/9 15:11
 * @description: 原子更新引用型
 */
public class AtomicReferenceTest {
    static AtomicReference<User> ar = new AtomicReference<User>();

    public static void main(String[] args) {
        User user = new User("zhangsan", 1);
        ar.set(user);
        User userUpdater = new User("lisi", 2);
        ar.compareAndSet(user, userUpdater);
        System.out.println(user.getName() + ":" + user.getId());
        System.out.println(ar.get().getName() + ":" + ar.get().getId());
    }

    static public class User {
        private String name;
        private int id;

        public User(String name, int id) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
