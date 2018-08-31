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
            System.out.println("�����ﵽ�����ͣ����***"+Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        productQueue.addLast(count+"");
        System.out.println("������Ʒ�ɹ�,��ţ�"+count+"����ǰ������"+size()+"***"+Thread.currentThread().getName());
        notify();
    }
    public synchronized String remove()
    {
        while (size() == 0)
        {
            System.out.println("Ŀǰû�в�Ʒ���޷�����***"+Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String remove = productQueue.removeFirst();
        System.out.println("�����Ʒ�ɹ�,��ţ�"+remove+"��ʣ��������"+size()+"***"+Thread.currentThread().getName());
        notify();
        return remove;
    }

    public synchronized int getCount() {
        return count;
    }
}
