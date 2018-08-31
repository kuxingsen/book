package javase.chap05.collection;

import java.util.LinkedList;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("bb");
        l1.add("cc");
        l1.addFirst("aa");
        l1.addLast("dd");
        l1.add(2,"insert");
        System.out.println(l1);
        l1.addFirst("11");
        l1.addLast("aa");
        l1.push("00");
        System.out.println(l1);
        System.out.println("----l1.pop()--------"+l1.pop());
        System.out.println("----l1.peek()--------"+l1.peek());
        System.out.println(l1.size());
        System.out.println("l1[3] = "+l1.get(3));
        System.out.println(l1);
        l1.remove(0);
        System.out.println(l1);
    }
}
