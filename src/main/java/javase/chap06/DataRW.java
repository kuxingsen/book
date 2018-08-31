package javase.chap06;

import java.io.*;
import java.util.Random;

/**
 * 将100个随机生成的小数【50，100】写入文件，要求以“#”分隔，然后从该文件依次读取每一个小数，求出其中的最大值、最小值、平均值并输出
 * RandomAccessFile
 * DataImputStream和DataOutputStream
 * Created by Kuexun on 2018/4/25.
 */
public class DataRW {
    public void writeByRandomAccessFile(){
        File file = new File("d:" + File.separator + "test1.txt");
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(file,"rw");
            for(int i = 0;i < 100;i++)
            {
                double d = Math.random()*50+50;
                System.out.println(d);
                raf.writeDouble(d);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public void readByRandomAccessFile()
    {
        File file = new File("d:" + File.separator + "test1.txt");
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(file, "rw");
            System.out.println(new String("------------------读取数据----------------------".getBytes("GBK"),"utf-8"));
            raf.seek(0);
            while(raf.getFilePointer() < 8*100)
            {
                System.out.println(raf.readDouble());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeByDataOutputStream()
    {
        try {
            FileOutputStream fos = new FileOutputStream("d:" + File.separator + "test2.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0;i < 100;i ++)
            {
                double d = Math.random()*50+50;
                System.out.println(d);
                dos.writeDouble(d);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readByDataInputStream()
    {
        try {
            FileInputStream fis = new FileInputStream("d:" + File.separator + "test2.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(new String("------------------读取数据----------------------".getBytes("GBK"),"utf-8"));
            for (int i = 0;i < 100;i ++)
            {
                System.out.println(dis.readDouble());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
