package javase.chap03.shape;

import java.awt.*;

/**
 * Created by 傻逼 on 2018/3/28.
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, Color color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double S = length*width;
        return S;
    }

    public double getPerimeter() {
        double L = 2*(length+width);
        return L;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
