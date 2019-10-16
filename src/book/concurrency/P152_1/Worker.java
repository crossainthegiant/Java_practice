package book.concurrency.P152_1;

/*
 * @Author: qph
 * @Date: 2019/9/24 15:18
 * @description: book.concurrency.P152_1
 */
public class Worker extends Thread {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("线程" + this.getId() + "正在打印" + i);
        }
    }

}
