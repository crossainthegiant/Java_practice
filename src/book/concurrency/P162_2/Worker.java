package book.concurrency.P162_2;

/*
 * @Author: qph
 * @Date: 2019/9/24 15:39
 * @description: book.concurrency.P162_2
 */
public class Worker implements Runnable {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("线程" + id + "正在输出" + i);
        }
    }
}
