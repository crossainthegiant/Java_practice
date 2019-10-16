package book.concurrency.P222_6;

/*
 * @Author: qph
 * @Date: 2019/9/24 15:58
 * @description: book.concurrency.P222_6
 */
public class Worker extends Thread {
    String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                this.setName(name);
            }
            System.out.println(this.getName() + "prints" + i);
        }
    }
}
