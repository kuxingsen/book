package javase.chap05.lang.runtime;

import java.io.IOException;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class RunTimeTest {
    public static void main(String[] args) throws IOException {
        //返回与当前java应用程序相关的运行时对象
        Runtime rt = Runtime.getRuntime();
        //运行path路径下的可执行文件
        rt.exec("notepad.exe");
        //返回JVM可用的最大内存量
        System.out.println("maxMemory:"+rt.maxMemory()+"B");
        //返回JVM可用的内存总量
        System.out.println("totalMemory:"+rt.totalMemory()+"B");
        //返回JVM可用的剩余内存
        System.out.println("freeMemory:"+rt.freeMemory()+"B");
    }
}
