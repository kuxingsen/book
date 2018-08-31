package javase.chap05;

import java.util.LinkedList;

/**
 * Created by Kuexun on 2018/5/1.
 */
public class MyStack<T>{
    private LinkedList<T> myStack;
    public MyStack()
    {
        myStack = new LinkedList<>();
    }
    public T pop()
    {
        T o = myStack.removeFirst();
        System.out.println(o);
        return o;
    }
    public void push(T o)
    {
        myStack.addFirst(o);
    }
    public int length()
    {
        return myStack.size();
    }
    @Override
    public String toString() {
        return myStack.toString();
    }

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("asdsad");
        myStack.push("123");
        myStack.push("jkh");
        myStack.push(";'[]");
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.length());

    }
}
