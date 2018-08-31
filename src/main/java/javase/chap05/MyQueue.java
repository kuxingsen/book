package javase.chap05;

import java.util.LinkedList;

/**
 * Created by Kuexun on 2018/5/1.
 */
public class MyQueue<E> {
    private LinkedList<E> myQueue;
    public MyQueue() {
        myQueue = new LinkedList<>();
    }

    public int length(){
        return myQueue.size();
    }
    public void add(E o)
    {
        myQueue.addLast(o);
    }
    public E remove()
    {
        return myQueue.removeFirst();
    }

    @Override
    public String toString() {
        return myQueue.toString();
    }

    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("asdsad");
        myQueue.add("123");
        myQueue.add("jkh");
        myQueue.add(";'[]");
        System.out.println(myQueue);
        System.out.println(myQueue.remove());
        System.out.println(myQueue);
        System.out.println(myQueue.length());

    }
}
