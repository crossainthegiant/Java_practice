package book.concurrency.P983_9;

/*
 * @Author: qph
 * @Date: 2019/9/25 21:48
 * @description: book.concurrency.P983_9
 */
public class Index {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Worker worker1 = new Worker(counter);
        Worker worker2 = new Worker(counter);
        worker1.start();
        worker2.start();
        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.get());

    }
}
