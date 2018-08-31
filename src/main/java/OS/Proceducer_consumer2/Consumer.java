package OS.Proceducer_consumer2;


/**
 * ������������
 * Created by Kuexun on 2018/6/4.
 */
public class Consumer implements Runnable {
    private ProductList products;

    public Consumer(ProductList products) {
        this.products = products;
    }

    @Override
    public void run() {
        while (true) {
            /*
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
            synchronized (Lock.lockA){
                while (products.size() == 0) {
                    System.out.println("Ŀǰû�в�Ʒ���޷�����***" + Thread.currentThread().getName());
                    try {
                        Lock.lockA.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                String remove = products.remove();
                System.out.println("�����Ʒ�ɹ�,��ţ�" + remove + "��ʣ��������" + products.size() + "***" + Thread.currentThread().getName());
                Lock.lockA.notifyAll();
            }
        }

    }
}
