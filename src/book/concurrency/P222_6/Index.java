package book.concurrency.P222_6;

/*
 * @Author: qph
 * @Date: 2019/9/24 16:04
 * @description: book.concurrency.P222_6
 */
public class Index {
    public static void main(String[] args) {
        Worker worker1 = new Worker("skilled worker ");
        Worker worker2 = new Worker("normal worker ");
        worker1.start();
        worker2.start();
    }
}
