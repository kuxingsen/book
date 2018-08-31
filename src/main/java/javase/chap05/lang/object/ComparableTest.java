package javase.chap05.lang.object;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Kuexun on 2018/4/30.
 */
class MyPoint extends Object implements Comparable<MyPoint>{

    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyPoint myPoint = (MyPoint) o;

        if (x != myPoint.x) return false;
        return y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * (result+31) + y;
        return result;
    }

    @Override
    public String toString() {
        return "[" + x +
                ", " + y +
                ']';
    }

    @Override
    public int compareTo(MyPoint o) {
        if(this.x == o.x)
        {
            return (int)(this.y-o.y);
        }else {
            return (int)(this.x-o.x);
        }
    }
}
public class ComparableTest {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(1,2);
        MyPoint p3 = new MyPoint(1,3);
        MyPoint p4 = new MyPoint(2,1);
        MyPoint p5 = new MyPoint(2,2);
        System.out.println(p1.equals(p2));
        HashSet<MyPoint> hs = new HashSet<MyPoint>();
        hs.add(p1);
        hs.add(p2);
        System.out.println(hs.size());
        TreeSet<MyPoint> ts = new TreeSet<MyPoint>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        System.out.println(ts);
    }
}
