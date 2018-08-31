package OS.Proceducer_consumer2;


/**
 * 先生产先消费
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
                    System.out.println("目前没有产品，无法购买***" + Thread.currentThread().getName());
                    try {
                        Lock.lockA.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                String remove = products.remove();
                System.out.println("购买产品成功,编号：" + remove + "。剩余数量：" + products.size() + "***" + Thread.currentThread().getName());
                Lock.lockA.notifyAll();
            }
        }

    }
}
