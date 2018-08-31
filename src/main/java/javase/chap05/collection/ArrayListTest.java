package javase.chap05.collection;

import java.util.ArrayList;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("78");
        a1.add("3.14");
        a1.add("China");
        a1.add("America");
        System.out.println(a1.get(1));
        a1.remove(3);
        System.out.println(a1.size());
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        //Collection 的所有子类都覆盖了Object类的头String()
        System.out.println(a1);
    }
}
