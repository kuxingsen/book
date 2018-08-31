package javase.chap05.lang.mathAndRandom;

import java.util.Random;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class RandomSeedTest {
    public static void main(String[] args) {
        //构造Random对象时不传入种子，自动以当前时间戳为种子产生随机序列
        Random rd1 = new Random();
        for(int i= 0; i <= 5; i++)
        {
            System.out.print(rd1.nextInt(100)+"\t");
        }
        System.out.println();
        for(int i= 0; i <= 5; i++)
        {
            System.out.print(rd1.nextInt(100)+"\t");
        }
        System.out.println();
        //如果指定了相同的种子，每个random对象产生的随机数具有相同的序列
        Random rd2 = new Random(10);
        for(int i= 0; i <= 5; i++)
        {
            System.out.print(rd2.nextInt(100)+"\t");
        }
        System.out.println();
        Random rd3 = new Random(10);
        for(int i= 0; i <= 5; i++)
        {
            System.out.print(rd3.nextInt(100)+"\t");
        }
        System.out.println();
    }
}
