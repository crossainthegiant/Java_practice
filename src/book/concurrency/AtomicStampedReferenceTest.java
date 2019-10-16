package book.concurrency;

import java.util.concurrent.atomic.AtomicStampedReference;

/*
 * @Author: qph
 * @Date: 2019/10/10 11:04
 * @description: book.concurrency
 */
public class AtomicStampedReferenceTest {
    static User user = new User("zhangsan", 10);
    static AtomicStampedReference<User> asr = new AtomicStampedReference<User>(user, 1);

    public static void main(String[] args) {
        User userUpdater = new User("lisi", 20);
        int stamp = asr.getStamp();
        asr.compareAndSet(user, userUpdater, asr.getStamp(), asr.getStamp() + 1);
        asr.compareAndSet(userUpdater, user, asr.getStamp(), asr.getStamp() + 1);
        if (asr.compareAndSet(user, userUpdater, stamp, stamp + 1)) {
            System.out.println("更新成功");
        } else {
            System.out.println("更新失败");
        }
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
