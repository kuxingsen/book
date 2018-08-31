package OS.Process_scheduling;

import java.util.Date;
import java.util.Random;

/**
 * Created by Kuexun on 2018/6/5.
 */
public class Main {
    public static void main(String[] args) {
        ProcessPool pool = new ProcessPool();
        Process p1 = new Process("1","aaa",80);
        Process p2 = new Process("2","bbb",50);
        Process p3 = new Process("3","ccc",85);
        Process p4 = new Process("4","ddd",10);
        pool.add(p1);
        pool.add(p2);
        pool.add(p3);
        pool.add(p4);

        Random random = new Random(System.currentTimeMillis());
        Process p5 = null;
        int sum=0;//线程运行总时间
        int num = 5;
        while (!pool.isEmpty()) {
            sum++;
            Process p = pool.getFirstProcess();
            p.work();
            if (p.getWorkTime() == 0) {
                pool.remove(p);
            }
            if(num < 10){
                if (sum % 4 == 3) {
                    int w = random.nextInt(100)+1;
                    System.out.println("新加入进程 process"+num+",工作时间为"+w);
                    p5 = new Process("" + num, "new"+num, w);
                    num++;
                    pool.add(p5);
                }
            }
            pool.changePriorty(p.getId());
            System.out.println();
        }
    }
}
