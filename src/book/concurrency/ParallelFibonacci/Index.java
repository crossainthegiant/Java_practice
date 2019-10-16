package book.concurrency.ParallelFibonacci;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/*
 * @Author: qph
 * @Date: 2019/10/7 17:39
 * @description: book.concurrency.ParallelFibonacci
 */
public class Index {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println("请输入一个数字n：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Fib task = new Fib(n);
        Future<Integer> result = forkJoinPool.submit(task);

        try {
            System.out.println("第" + n + "项为" + task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}


