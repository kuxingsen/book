package OS.Proceducer_consumer2;


/**
 * Created by Kuexun on 2018/6/4.
 */
public class Producer implements Runnable{
    private ProductList products;
    private int max;

    public Producer(ProductList products) {
        this.products = products;
        this.max = products.getMax();
    }

    @Override
    public void run() {
        while (true)
        {
           /* try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*///�߳�����10ms
            synchronized (Lock.lockA){
                while (products.size() == max){
                    System.out.println("�����ﵽ�����ͣ����***"+Thread.currentThread().getName());
                    try {
                        Lock.lockA.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                products.add();
                System.out.println("������Ʒ�ɹ�,��ţ�"+products.getCount()+"����ǰ������"+products.size()+"***"+Thread.currentThread().getName());
                Lock.lockA.notifyAll();
            }
        }
    }
}
