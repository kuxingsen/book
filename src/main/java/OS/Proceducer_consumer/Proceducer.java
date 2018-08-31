package OS.Proceducer_consumer;

/**
 * Created by Kuexun on 2018/6/4.
 */
public class Proceducer implements Runnable{
    private ProductList products;
    private int max;

    public Proceducer(ProductList products) {
        this.products = products;
        this.max = max;
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
            products.add();
        }
    }
}
