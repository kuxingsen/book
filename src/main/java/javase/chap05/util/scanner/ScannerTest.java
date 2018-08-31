package javase.chap05.util.scanner;

import javase.chap04.OutterClass_9.OutterClass;

import java.util.Scanner;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("请输入若干个小数，没输入一个数用回车确认");
        System.out.println("最后输入一个非数字结束输入操作");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int n = 0;
        while (reader.hasNextDouble())
        {
            double x = reader.nextDouble();
            n = n+1;
            sum += x;
        }
        System.out.printf("%d 个数的和为%f\n",n,sum);
        System.out.printf("%d 个数的平均值为%f\n",n,sum/n);

    }
}
