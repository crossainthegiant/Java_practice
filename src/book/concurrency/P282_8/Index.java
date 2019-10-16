package book.concurrency.P282_8;

/*
 * @Author: qph
 * @Date: 2019/9/24 20:30
 * @description: book.concurrency.P282_8
 */
public class Index {
    public static void main(String[] args) {
        Worker worker1 = new Worker("james", 9);
        Worker worker2 = new Worker("john", 3);
        worker1.start();
        worker2.start();
    }
}
