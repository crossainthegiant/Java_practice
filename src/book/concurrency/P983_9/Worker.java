package book.concurrency.P983_9;

/*
 * @Author: qph
 * @Date: 2019/9/25 21:45
 * @description: book.concurrency.P983_9
 */
public class Worker extends Thread {
    Counter counter;

    Worker(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increase();
        }
    }
}
