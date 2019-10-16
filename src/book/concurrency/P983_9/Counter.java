package book.concurrency.P983_9;

/*
 * @Author: qph
 * @Date: 2019/9/25 21:42
 * @description: book.concurrency.P983_9
 */

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger ia = new AtomicInteger();

    public void increase() {
        ia.getAndIncrement();
    }

    public int get() {
        return ia.get();
    }
}
