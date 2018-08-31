package OS.Proceducer_consumer;

import java.util.LinkedList;

public class ProductList {
    private LinkedList<String> productQueue;
    private int max;
    private int count;

    public ProductList(int max) {
        productQueue = new LinkedList<>();
        this.max = max;
        this.count = 0;
    }

    public synchronized int size(){
        return productQueue.size();
    }
    public synchronized void add()
    {
        while (size() == max)
        {
            System.out.println("数量达到最大，暂停生产***"+Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        productQueue.addLast(count+"");
        System.out.println("生产产品成功,编号："+count+"。当前数量："+size()+"***"+Thread.currentThread().getName());
        notify();
    }
    public synchronized String remove()
    {
        while (size() == 0)
        {
            System.out.println("目前没有产品，无法购买***"+Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String remove = productQueue.removeFirst();
        System.out.println("购买产品成功,编号："+remove+"。剩余数量："+size()+"***"+Thread.currentThread().getName());
        notify();
        return remove;
    }

    public synchronized int getCount() {
        return count;
    }
}
