package javase.chap05.collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class TreeTest {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("4");
        ts.add("z");
        ts.add("2");
        ts.add("3");
        ts.add("4");
        ts.add("a");
        ts.add("ab");
        ts.add("aa");
        ts.remove("ab");
        System.out.println(ts);
        Iterator<String> it = (Iterator<String>)ts.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
