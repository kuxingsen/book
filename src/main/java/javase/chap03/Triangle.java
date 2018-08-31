package javase.chap03;

/**
 * Created by 傻逼 on 2018/3/27.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getArea()
    {
        double s;
        double l = (a+b+c)/2;
        s = Math.sqrt(l*(l-a)*(l-b)*(l-c));
        return s;
    }
    public double getPerimeter()
    {
        double c;
        c = a+b+this.c;
        return c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
