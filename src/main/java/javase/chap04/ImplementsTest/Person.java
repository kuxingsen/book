package javase.chap04.ImplementsTest;

/**
 * Created by 傻逼 on 2018/4/4.
 */
public class Person implements Human {
    public Person() {
    }

    public void breathe() {
        System.out.println("breathe....");
    }

    public void think() {
        System.out.println("think....");
    }

    public void learn() {
        System.out.println("learn...");
    }

    public void eat() {
        System.out.println("eat...");
    }

    public void sleep() {
        System.out.println("sleep...");
    }
}
