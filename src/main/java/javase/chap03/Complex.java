package javase.chap03;

/**
 * Created by 傻逼 on 2018/3/27.
 */
public class Complex {
    private double a;
    private double b;

    public Complex() {
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
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

    @Override
    public String toString() {
        return "(" + a +
                "+" + b +"i)";
    }

    public static Complex add(Complex c1,Complex c2)
    {
        double a = c1.getA()+c2.getA();
        double b = c1.getB()+c2.getB();
        return new Complex(a,b);
    }
    public static Complex subtract(Complex c1,Complex c2)
    {
        double a = c1.getA()-c2.getA();
        double b = c1.getB()-c2.getB();
        return new Complex(a,b);
    }
    public static Complex multiply(Complex c1,Complex c2)
    {
        double a = c1.getA()*c2.getA() - c1.getB()*c2.getB();
        double b = c1.getA()+c2.getB()+c1.getA()+c2.getA();
        return new Complex(a,b);
    }
    public static Complex divide(Complex c1,Complex c2)
    {
        double a =c1.getA();
        double b = c1.getB();
        double c =c2.getA();
        double d = c2.getB();

        double aN = (a*c+b*d)/(c*c+d*d);
        double bN = (b*c-a*d)/(c*c+d*d);
        return new Complex(aN,bN);
    }
}
