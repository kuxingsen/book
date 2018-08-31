package javase.chap03;

import javase.chap03.shape.Circle;
import javase.chap03.shape.Rectangle;
import javase.chap03.shape.Shape;
import javase.chap03.shape.Triangle;
import org.junit.Test;

import java.awt.*;
import java.util.Scanner;


/**
 * Created by 傻逼 on 2018/3/27.
 */
public class MyTest {

    @Test
    public void testStock()
    {
        Stock stock = new Stock();
        stock.setCurrentPrice(Math.random()*50+50);
        stock.setName("Sun");
        stock.setSymbol("SUNW");
        stock.setPreviousClosingPrice(50f);
        System.out.println(stock);
    }
    @Test
    public void testTriangle()
    {
        javase.chap03.Triangle triangle1 = new javase.chap03.Triangle(3f,4f,5f);
        System.out.println(triangle1);
        System.out.println("The first triangle's L = "+triangle1.getPerimeter()+" ,and the S = "+triangle1.getArea());
        System.out.println("--------分割线---------");
        Triangle triangle2 = new Triangle();
        triangle2.setA(3f);
        triangle2.setB(4f);
        triangle2.setC(5f);
        System.out.println(triangle1);
        System.out.println("The first triangle's L = "+triangle1.getPerimeter()+" ,and the S = "+triangle1.getArea());
    }
    @Test
    public void testComplex()
    {
        Complex complex1 = new Complex();
        double a = 1;
        double b = 2;
        complex1.setA(a);
        complex1.setB(b);
        Complex complex2 = new Complex(a,b);

        System.out.println("加："+complex1+" + "+complex2+" = "+Complex.add(complex1,complex2));
        System.out.println("减："+complex1+" - "+complex2+" = "+Complex.subtract(complex1,complex2));
        System.out.println("乘："+complex1+" * "+complex2+" = "+Complex.multiply(complex1,complex2));
        System.out.println("除："+complex1+" / "+complex2+" = "+Complex.divide(complex1,complex2));
    }
    @Test
    public void testHanoiTower()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入 n 的值");
        int n = 3;
        System.out.println(n);
        HanoiTower.Hannoi(n,'A','B','C');
    }
    public void addOne(Shape shape)
    {
        if(shape instanceof Circle)
        {
            System.out.println("Circle :::");
            double radius = ((Circle) shape).getRadius();
            ((Circle) shape).setRadius(radius + 1);
        }
        if (shape instanceof Triangle)
        {
            System.out.println("Triangle :::");
            double a = ((Triangle) shape).getA()+1;
            double b = ((Triangle) shape).getB()+1;
            double c = ((Triangle) shape).getC()+1;
            ((Triangle) shape).setA(a);
            ((Triangle) shape).setB(b);
            ((Triangle) shape).setC(c);

        }
        if (shape instanceof Rectangle)
        {
            System.out.println("Rectangle :::");
            double length = ((Rectangle) shape).getLength();
            double width = ((Rectangle) shape).getWidth();
            ((Rectangle) shape).setLength(length);
            ((Rectangle) shape).setWidth(width);
        }

        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
    @Test
    public void testShape()
    {
        Circle circle = new Circle(1,new Color(1,2,3));
        addOne(circle);
        Triangle triangle = new Triangle(3f,4f,5f,new Color(1,2,3));
        addOne(triangle);
        Rectangle rectangle = new Rectangle(2,3,new Color(1,2,3));
        addOne(rectangle);
    }
}