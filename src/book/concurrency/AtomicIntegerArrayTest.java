package book.concurrency;

import java.util.concurrent.atomic.AtomicIntegerArray;

/*
 * @Author: qph
 * @Date: 2019/10/8 18:59
 * @description: book.concurrency
 */
public class AtomicIntegerArrayTest {
    static int[] array = new int[]{1, 2};
    static AtomicIntegerArray aia = new AtomicIntegerArray(array);

    public static void main(String[] args) {
        aia.getAndSet(1, 3);
        System.out.println(aia.get(1));
        System.out.println(array[1]);
    }
}
