package javase.chap05.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> ca = new ArrayList<>();
        ca.add("肇庆学院");
        ca.add("计算机学院");
        ca.add("郑伟");
        //1.使用Iterator遍历集合
        Iterator<String> it = ca.iterator();
        String s = null;
        while (it.hasNext())
        {
            s = it.next();
            System.out.println(s);
        }
        //2.使用Foreach遍历集合,JDK1.5以上版本
        for (String s1 :
                ca) {
            System.out.println(s1);
        }
        //3.使用toString()输出集合的所有元素
        System.out.println(ca.toString());
    }
}
