package book.concurrency.P162_2;

/*
 * @Author: qph
 * @Date: 2019/9/24 15:42
 * @description: book.concurrency.P162_2
 */
public class Index {
    public static void main(String[] args) {
        Worker worker1 = new Worker(1);
        Worker worker2 = new Worker(2);
        Thread t1 = new Thread(worker1);
        Thread t2 = new Thread(worker2);
        t1.start();
        t2.start();
    }

}
