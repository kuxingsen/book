package javase.chap04.ExtendsTest;

/**
 * Created by 傻逼 on 2018/4/4.
 */
public class Truck extends Car{
    private double payload;

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public Truck() {
    }

    @Override
    public String toString() {
        return "Truck{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                "loader=" + loader +
                ", payload=" + payload +
                '}';
    }
}
