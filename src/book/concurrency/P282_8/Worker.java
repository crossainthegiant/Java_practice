package book.concurrency.P282_8;

/*
 * @Author: qph
 * @Date: 2019/9/24 20:20
 * @description: book.concurrency.P282_8线程的优先级举例
 */
public class Worker extends Thread {
    private String name;

    public Worker(String name, int priority) {
        this.name = name;
        if (priority > 10 || priority < 1) {
            System.out.println("error");
            this.setPriority(Thread.NORM_PRIORITY);
        } else {
            this.setPriority(priority);
        }
    }

    @Override
    public void run() {
        System.out.println(name + "的优先级为" + this.getPriority());
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + "prints" + i);
        }
    }
}
