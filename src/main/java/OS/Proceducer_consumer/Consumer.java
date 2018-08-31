package OS.Proceducer_consumer;

/**
 * Created by Kuexun on 2018/6/4.
 */
public class Consumer implements Runnable {
    private ProductList products;

    public Consumer(ProductList products) {
        this.products = products;
    }

    @Override
    public void run() {
        while (true)
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            products.remove();
        }

    }
}
