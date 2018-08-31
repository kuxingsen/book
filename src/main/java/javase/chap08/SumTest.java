package javase.chap08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Kuexun on 2018/5/23.
 */
class Lock{
    public final static Lock lock = new Lock();
}
public class SumTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        final int[] totalSum = new int[10];
        for (int i = 0; i < 10; i++) {
            final int task=i;//第i个线程
            final int j=task*10000;//某个线程的开始数
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    int sum=0;
                    for(int k = j+1;k <= (task+1)*10000; k++)
                    {
                        sum+=k;
                    }
                    totalSum[task] = sum;
                }
            });
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long sum = 0;
        for (int s :
                totalSum) {
            System.out.println(s);
            sum+=s;
        }
        System.out.println(sum);
    }
}
