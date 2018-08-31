package javase.chap04.ExtendsTest;

/**
 * Created by 傻逼 on 2018/4/4.
 */
public class Car extends Vehicle {
    protected int loader;

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public Car() {
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                "loader=" + loader +
                '}';
    }
}
