package book.concurrency.P152_1;

/*
 * @Author: qph
 * @Date: 2019/9/24 15:28
 * @description: book.concurrency.P152_1
 */
public class Index {
    public static void main(String[] args) {
        Worker worker1 = new Worker(1);
        Worker worker2 = new Worker(2);
        worker1.start();
        worker2.start();
    }
}
