package javase.chap03.shape;

import java.awt.*;

/**
 * Created by 傻逼 on 2018/3/27.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double s = PI * radius * radius;
        return s;
    }

    public double getPerimeter() {
        double l = PI * 2 * radius;
        return l;
    }
}
