package javase.chap04.OutterClass_9;

/**
 * Created by Kuexun on 2018/4/29.
 */
public class OutterClass {
    private static double PI = 3.14;
    private double r = 10;
    static class SInner{
        static void getPerimeter()
        {
            System.out.println("SInner.........getPerimeter");
            //静态内部类的方法只能直接访问外部类的类成员变量和方法
            System.out.println(2*PI*10);
        }
        void getArea()
        {
            System.out.println("SInner.........getArea");
            System.out.println(PI*10*10);
        }
    }
    class OInner
    {
        void getPerimeter()
        {
            //对象内部类的方法可以直接访问外部类的成员变量和方法
            System.out.println("OInner.........getPerimeter");
            System.out.println(2*PI*r);
        }
    }

    public static void main(String[] args) {
        //访问静态内部类的静态方法
        OutterClass.SInner.getPerimeter();
        //访问静态内部类的非静态方法
        OutterClass.SInner os = new SInner();
        os.getArea();
        //访问对象内部类的方法
        OutterClass.OInner oc = new OutterClass().new OInner();
        oc.getPerimeter();
    }
}
