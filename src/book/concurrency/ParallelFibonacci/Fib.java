package book.concurrency.ParallelFibonacci;

import java.util.concurrent.RecursiveTask;

/*
 * @Author: qph
 * @Date: 2019/10/7 17:22
 * @description: book.concurrency.ParallelFibonacci用fork/join方法求
 */
public class Fib extends RecursiveTask<Integer> {
    private int number;

    public Fib(int number) {
        this.number = number;
    }

    @Override
    protected Integer compute() {
        Integer result;
        if (number <= 10) {
            result = getValue(number);
        } else {
            Fib fibTask1 = new Fib(number - 1);
            Fib fibTask2 = new Fib(number - 2);
            fibTask1.fork();
            fibTask2.fork();
            int fibResult1 = fibTask1.join();
            int fibResult2 = fibTask2.join();
            result = fibResult1 + fibResult2;

        }
        return result;

    }

    private int getValue(int n) {
        int[] fib = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        return fib[n - 1];
    }

}
