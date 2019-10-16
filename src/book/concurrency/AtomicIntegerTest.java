package book.concurrency;

/*
 * @Author: qph
 * @Date: 2019/9/26 11:12
 * @description: book.concurrency
 */

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.get());
    }
}
