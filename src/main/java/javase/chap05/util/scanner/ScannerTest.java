package javase.chap05.util.scanner;

import javase.chap04.OutterClass_9.OutterClass;

import java.util.Scanner;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("���������ɸ�С����û����һ�����ûس�ȷ��");
        System.out.println("�������һ�������ֽ����������");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int n = 0;
        while (reader.hasNextDouble())
        {
            double x = reader.nextDouble();
            n = n+1;
            sum += x;
        }
        System.out.printf("%d �����ĺ�Ϊ%f\n",n,sum);
        System.out.printf("%d ������ƽ��ֵΪ%f\n",n,sum/n);

    }
}
