package OS.Proceducer_consumer;

/**
 * Created by Kuexun on 2018/6/4.
 */
public class Main {
    public static void main(String[] args) {
        ProductList products = new ProductList(1000);
        new Thread(new Proceducer(products),"proceducer-----1").start();
        new Thread(new Proceducer(products),"proceducer-----2").start();
        new Thread(new Consumer(products),"consumer-----1").start();
        new Thread(new Consumer(products),"consumer-----2").start();
    }
}
