package javase.chap03.shape;

import java.awt.*;

/**
 * Created by 傻逼 on 2018/3/27.
 */
public abstract class Shape {
    final static double PI = 3.14;
    Color color;
    abstract public double getArea();
    abstract public double getPerimeter();
}
